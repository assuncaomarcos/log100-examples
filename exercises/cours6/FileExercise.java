package cours6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class FileManager {
    private static final String FILE_NAME = "names.txt";

    public void writeNamesToFile(List<String> names) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            for (String name : names) {
                writer.write(name + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> readNamesFromFile() {
        List<String> names = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }
}

public class FileExercise {

    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        // Écriture de noms dans le fichier
        List<String> namesToWrite = List.of("Émilie", "Gabriel", "Léa", "Xavier");
        fileManager.writeNamesToFile(namesToWrite);
        System.out.println("Noms écrits dans le fichier.");

        // Lecture des noms depuis le fichier
        List<String> namesRead = fileManager.readNamesFromFile();
        System.out.println("Noms lus depuis le fichier :");
        for (String name : namesRead) {
            System.out.println(name);
        }
    }
}
