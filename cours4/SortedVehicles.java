import java.util.Comparator;
import java.util.TreeSet;

class Vehicle {
    private int year;
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return String.format("%s %s %d", this.brand, this.model, this.year);
    }
}

public class SortedVehicles {

    public static void main(String[] args) {
        TreeSet<Vehicle> vehicles = new TreeSet<>(Comparator.comparing(Vehicle::getYear));
        vehicles.add(new Vehicle("Honda", "Civic", 2020));
        vehicles.add(new Vehicle("Honda", "Civic", 2019));
        vehicles.add(new Vehicle("Toyota", "Corolla", 2014));
        vehicles.add(new Vehicle("Toyota", "Corolla", 2011));
        vehicles.add(new Vehicle("Toyota", "Corolla", 2009));
        vehicles.add(new Vehicle("International", "Lonestar", 2022));

        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }
}
