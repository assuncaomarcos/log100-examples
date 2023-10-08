package streams_records;

import java.util.ArrayList;
import java.util.List;

record Person(String name, int age) { }

public class AverageAge {

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Élise", 28));
        people.add(new Person("Alexandre", 35));
        people.add(new Person("Camille", 42));
        people.add(new Person("Mathis", 29));
        people.add(new Person("Léa", 31));

        // Filtrer les personnes dont l'âge est supérieur à 30 ans
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.age() > 30)
                .toList();

        // Calculer la moyenne d'âge des personnes restantes
        double averageAge = filteredPeople.stream()
                .mapToInt(Person::age)
                .average()
                .orElse(0);

        System.out.println("Personnes dont l'âge est supérieur à 30 ans : " + filteredPeople);
        System.out.println("Moyenne d'âge : " + averageAge);
    }
}
