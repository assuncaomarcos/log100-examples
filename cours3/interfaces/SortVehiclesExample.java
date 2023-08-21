package interfaces;

import java.util.ArrayList;
import java.util.List;

public class SortVehiclesExample {

    static void printVehicleList(List<Vehicle> list) {
        for (Vehicle v : list) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        for (int year = 2021; year >= 2015; year--){
            vehicles.add(new Car("Toyota", "Corolla", year, 4));
            vehicles.add(new Truck("International", "Lonestar", year, 4));
        }

        System.out.println("Liste avant trier par année");
        printVehicleList(vehicles);

        System.out.println("\nListe après trier par année");
        vehicles.sort(new ComparatorVehicle());
        printVehicleList(vehicles);
    }
}
