import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashSet;
import java.util.Iterator;

public class UseHashSet {

    // methode qui lance une requete HTTP et renvoie
    // la réponse HTTP
    public static String get(String uri) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Il faut l'adresse HTTP pour lancer la requete");
            System.exit(-1);
        }

        try {
            String text = get(args[0]);
            HashSet<String> words = new HashSet<>();
            long totalTime = 0;

            for (String word : text.split("\\s+")) {
                long callTime = System.currentTimeMillis();
                words.add(word);
                totalTime += System.currentTimeMillis() - callTime;
            }

            Iterator<String> iter = words.iterator();
            for (int i = 1; i <= 20 && iter.hasNext(); i++) {
                System.out.println(iter.next());
            }

            System.out.println("...");
            System.out.println(words.size() + " mots distincts. " + totalTime + " millisecondes.");

        } catch (Exception e) {
            System.out.println("Probleme avec la requete HTTP : " + e.getMessage());
        }
    }
}