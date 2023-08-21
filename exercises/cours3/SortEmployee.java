package cours3;

import java.util.ArrayList;
import java.util.Comparator;

public class SortEmployee {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("Marie", "adresse1", 18, 50000f));
        list.add(new Employee("Julie", "adresse2", 22, 45000f));
        list.add(new Employee("Olivier", "adresse3", 23, 40000f));
        list.add(new Employee("Piere", "adresse4", 23, 35000f));

        list.sort(new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });

        for (Employee e : list) {
            System.out.println(e);
        }
    }
}
