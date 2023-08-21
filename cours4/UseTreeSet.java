import java.util.Iterator;
import java.util.TreeSet;

public class UseTreeSet extends UseHashSet {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Il faut l'adresse HTTP pour lancer la requete");
            System.exit(-1);
        }

        try {
            String text = get(args[0]);
            TreeSet<String> words = new TreeSet<>();
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
