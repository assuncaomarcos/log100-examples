package cours2;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String toString() {
        return name + ", a " + age + " ans et habite à " + address;
    }

    public static void main(String[] args) {
        Person[] people = new Person[5];

        for (int i = 1; i <= 5; i++) {
            people[i-1] = new Person("Name" + i, 30+i, "Address " + i);
        }

        for (Person p : people) {
            System.out.println(p);
        }
    }
}
