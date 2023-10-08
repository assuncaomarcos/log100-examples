package io;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File file = new File("fichier.txt");
            if (file.createNewFile()) {
                System.out.println("Fichier crée: " + file.getName());
            } else {
                System.out.println("Fichier existe déjà.");
            }
        } catch (IOException e) {
            System.out.println("Erreur: " + e.getMessage());
        }
    }
}
