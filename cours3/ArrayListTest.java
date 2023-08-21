import inheritance.Car;
import inheritance.Truck;
import inheritance.Vehicle;

import java.util.LinkedList;

public class ArrayListTest {

    public static void main(String[] args) {
        LinkedList<Vehicle> vehicles = new LinkedList<>();
        // ajoute quelques voitures
        vehicles.add(new Car("Honda", "Civic", 2020, 4));
        vehicles.add(new Car("Toyota", "Corolla", 2014, 2));

        // ajoute quelques camions
        vehicles.add(new Truck("International", "Lonestar", 2020, 4));
        vehicles.add(new Truck("Volvo", "VNR", 2021, 3));

        for (Vehicle v : vehicles) {
            v.start();
        }

        for (Vehicle v : vehicles) {
            System.out.println(v.toString());
        }
    }
}