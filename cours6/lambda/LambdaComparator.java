package lambda;

import java.util.Comparator;

class Student {
    String firstName;
    String lastName;

    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

public class LambdaComparator {

    public static void main(String[] args) {
        Comparator<Student> comparator = (e1, e2) -> e1.firstName.compareTo(e2.firstName);

        Student e1 = new Student("Béatrice", "Guérin");
        Student e2 = new Student("Damien", "Mercier");

        int res = comparator.compare(e1, e2);         // < 0
        System.out.println(res);
        res = comparator.reversed().compare(e1, e2);  // > 0
        System.out.println(res);
    }
}
