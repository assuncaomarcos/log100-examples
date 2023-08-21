import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String[] data = new String[] {
                "Pellentesque quis arcu quis nisi rutrum mollis in non augue.",
                "Nullam laoreet ipsum nec ultrices tincidunt.",
                "Integer eu enim ac nunc finibus ornare id a mauris.",
                "Sed sit amet tellus non odio tempor pretium.",
                "Donec pharetra orci quis eros tincidunt malesuada."
        };

        try (FileWriter writer = new FileWriter("fichier.txt");) {
            for (String d : data) {
                writer.write(d + "\n");
            }

            System.out.println("Contenu écrit dans le fichier.");
        } catch (IOException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}