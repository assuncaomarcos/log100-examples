import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.*;
import java.net.InetSocketAddress;

public class StaticWebServer {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage : java StaticWebServer <numéro de port> <repertoire racine>");
            System.exit(1);
        }

        HttpServer server;

        try {
            int port = Integer.parseInt(args[0]);
            String fileSystemRoot = args[1];

            server = HttpServer.create(new InetSocketAddress(port), 10);
            StaticFileHandler.create(server, "/static/", fileSystemRoot, "index.html");
            server.setExecutor(null);

            // Pour intercepter Ctrl+C
            Runtime.getRuntime().addShutdownHook(new Thread(() -> {
                System.out.println("En train d'arreter le serveur...");
                server.stop(0);
            }));

            System.out.println("En train d'initialiser le serveur...");
            server.start();
        } catch (NumberFormatException nfe) {
            System.err.println("Numero de port invalide: " + nfe.getMessage());
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Erreur d'execution du serveur: " + e.getMessage());
        }
    }
}