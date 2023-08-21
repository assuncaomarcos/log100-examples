/*
Code adapté de :
https://stackoverflow.com/questions/15902662/how-to-serve-static-content-using-suns-simple-httpserver
 */
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StaticFileHandler implements HttpHandler {
    private static final Map<String, String> MIME_MAP =
            new HashMap<>() {{
                put("appcache", "text/cache-manifest");
                put("css", "text/css");
                put("gif", "image/gif");
                put("html", "text/html");
                put("js", "application/javascript");
                put("json", "application/json");
                put("jpg", "image/jpeg");
                put("jpeg", "image/jpeg");
                put("mp4", "video/mp4");
                put("pdf", "application/pdf");
                put("png", "image/png");
                put("svg", "image/svg+xml");
                put("xlsm", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
                put("xml", "application/xml");
                put("zip", "application/zip");
                put("md", "text/plain");
                put("txt", "text/plain");
                put("php", "text/plain");
            }};

    private String filesystemRoot;
    private String urlPrefix;
    private String directoryIndex;

    /**
     * @param urlPrefix The prefix of all URLs.
     *                   This is the first argument to createContext. Must start and end in a slash.
     * @param filesystemRoot The root directory in the filesystem.
     *                       Only files under this directory will be served to the client.
     *                       For instance "./staticfiles".
     * @param directoryIndex File to show when a directory is requested, e.g. "index.html".
     */
    public StaticFileHandler(String urlPrefix, String filesystemRoot, String directoryIndex) {
        if (!urlPrefix.startsWith("/")) {
            throw new RuntimeException("pathPrefix does not start with a slash");
        }
        if (!urlPrefix.endsWith("/")) {
            throw new RuntimeException("pathPrefix does not end with a slash");
        }
        this.urlPrefix = urlPrefix;

        assert filesystemRoot.endsWith("/");
        try {
            this.filesystemRoot = new File(filesystemRoot).getCanonicalPath();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        this.directoryIndex = directoryIndex;
    }

    /**
     * Create and register a new static file handler.
     * @param hs The HTTP server where the file handler will be registered.
     * @param path The path in the URL prefixed to all requests, such as "/static/"
     * @param filesystemRoot The filesystem location.
     *                       For instance "/var/www/mystaticfiles/".
     *                       A request to "/static/x/y.html" will be served from the filesystem file "/var/www/mystaticfiles/x/y.html"
     * @param directoryIndex File to show when a directory is requested, e.g. "index.html".
     */
    public static void create(HttpServer hs, String path, String filesystemRoot, String directoryIndex) {
        StaticFileHandler sfh = new StaticFileHandler(path, filesystemRoot, directoryIndex);
        hs.createContext(path, sfh);
    }

    public void handle(HttpExchange he) throws IOException {
        String method = he.getRequestMethod();
        if (! ("HEAD".equals(method) || "GET".equals(method))) {
            sendError(he, 501, "Unsupported HTTP method");
            return;
        }

        String wholeUrlPath = he.getRequestURI().getPath();
        if (wholeUrlPath.endsWith("/")) {
            wholeUrlPath += directoryIndex;
        }
        if (! wholeUrlPath.startsWith(urlPrefix)) {
            throw new RuntimeException("Path is not in prefix - incorrect routing?");
        }
        String urlPath = wholeUrlPath.substring(urlPrefix.length());

        File f = new File(filesystemRoot, urlPath);
        File canonicalFile;
        try {
            canonicalFile = f.getCanonicalFile();
        } catch (IOException e) {
            // This may be more benign (i.e. not an attack, just a 403),
            // but we don't want the attacker to be able to discern the difference.
            reportPathTraversal(he);
            return;
        }

        String canonicalPath = canonicalFile.getPath();
        if (! canonicalPath.startsWith(filesystemRoot)) {
            reportPathTraversal(he);
            return;
        }

        try (FileInputStream fis = new FileInputStream(canonicalFile); ) {
            String mimeType = lookupMime(urlPath);
            he.getResponseHeaders().set("Content-Type", mimeType);
            if ("GET".equals(method)) {
                he.sendResponseHeaders(200, canonicalFile.length());
                OutputStream os = he.getResponseBody();
                copyStream(fis, os);
                os.close();
            } else {
                assert("HEAD".equals(method));
                he.sendResponseHeaders(200, -1);
            }
        } catch (FileNotFoundException e) {
            // The file may also be forbidden to us instead of missing, but we're leaking less information this way
            sendError(he, 404, "File not found");
        }
    }

    private void copyStream(InputStream is, OutputStream os) throws IOException {
        byte[] buf = new byte[4096];
        int n;
        while ((n = is.read(buf)) >= 0) {
            os.write(buf, 0, n);
        }
    }

    private void sendError(HttpExchange he, int rCode, String description) throws IOException {
        String message = "HTTP error " + rCode + ": " + description;
        byte[] messageBytes = message.getBytes("UTF-8");

        he.getResponseHeaders().set("Content-Type", "text/plain; charset=utf-8");
        he.sendResponseHeaders(rCode, messageBytes.length);

        try ( OutputStream os = he.getResponseBody(); ) {
            os.write(messageBytes);
        }
    }

    // This is one function to avoid giving away where we failed
    private void reportPathTraversal(HttpExchange he) throws IOException {
        sendError(he, 400, "Path traversal attempt detected");
    }

    private static String getExt(String path) {
        int slashIndex = path.lastIndexOf('/');
        String basename = (slashIndex < 0) ? path : path.substring(slashIndex + 1);

        int dotIndex = basename.lastIndexOf('.');
        if (dotIndex >= 0) {
            return basename.substring(dotIndex + 1);
        } else {
            return "";
        }
    }

    private static String lookupMime(String path) {
        String ext = getExt(path).toLowerCase();
        return MIME_MAP.getOrDefault(ext, "application/octet-stream");
    }
}