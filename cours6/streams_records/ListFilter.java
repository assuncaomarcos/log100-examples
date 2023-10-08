package streams_records;

import java.util.Arrays;
import java.util.List;

public class ListFilter {
    public static void main(String[] args) {
        // Créer une liste de nombres
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Utiliser Stream pour filtrer les nombres pairs
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        // Afficher les nombres pairs
        System.out.println("Nombres pairs : " + evenNumbers);
    }
}
