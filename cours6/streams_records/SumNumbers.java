package streams_records;

import java.util.Arrays;
import java.util.List;

public class SumNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Utiliser Stream pour mapper et réduire les nombres
        int sum = numbers.stream() // flux d'Integer
                .mapToInt(Integer::intValue) // Pour créer un flux IntStream
                .sum();

        System.out.println("Somme des nombres : " + sum);
    }
}
