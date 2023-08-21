import inheritance.Car;
import inheritance.Truck;
import inheritance.Vehicle;

public class PrintVehicles {
    static void print(Vehicle vehicle) {
        System.out.println("Affiche vehicle: " + vehicle.getBrand());
    }

    static void print(Car car) {
        System.out.println("Affiche voiture: " + car.getBrand());
    }

    static void print(Truck truck) {
        System.out.println("Affiche camion: " + truck.getBrand());
    }

    public static void main(String[] args) {
        Vehicle tesla = new Car("Tesla", "3", 2021, 4);
        Car toyota = new Car("Toyota", "Corolla", 2014, 2);
        Truck international = new Truck("International", "LT", 2020, 4);

        print(tesla);
        print(toyota);
        print(international);
    }
}