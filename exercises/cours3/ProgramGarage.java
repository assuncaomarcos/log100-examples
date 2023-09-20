package cours3;

import java.util.ArrayList;

class Vehicle {
    private String brand;
    private String model;
    private int year;

    private boolean parked;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }

    public boolean isParked() {
        return this.parked;
    }

    public void setParked(boolean parked) {
        this.parked = parked;
    }

    public String getBrand() { return brand; }

    public void setBrand(String brand) { this.brand = brand; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getYear() { return year; }

    public void setYear(int year) { this.year = year; }

    public String toString() {
        return String.format("%s %s %d est %s",
                this.brand, this.model, this.year,
                this.parked ? "au garage" : "hors du garage");
    }
}

class Garage {
    private final ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        vehicle.setParked(true);
        vehicles.add(vehicle);
    }

    public void showVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Marque : " + vehicle.getBrand());
            System.out.println("Modèle : " + vehicle.getModel());
            System.out.println("Année de fabrication : " + vehicle.getYear());
            System.out.println();
        }
    }

    public int countVehicles() {
        return vehicles.size();
    }

    public boolean removeVehicle(Vehicle vehicle) {
        vehicle.setParked(false);
        return vehicles.remove(vehicle);
    }
}

public class ProgramGarage {

    public static void main(String[] args) {
        Garage garage = new Garage();

        Vehicle vehicle1 = new Vehicle("Toyota", "Camry", 2020);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2019);
        Vehicle vehicle3 = new Vehicle("Ford", "F-150", 2022);

        garage.addVehicle(vehicle1);
        garage.addVehicle(vehicle2);
        garage.addVehicle(vehicle3);

        System.out.println("Liste des véhicules dans le garage :");
        garage.showVehicles();

        System.out.println("Nombre total de véhicules dans le garage : " + garage.countVehicles());

        if (garage.removeVehicle(vehicle3)) {
            System.out.println("Nombre total de véhicules dans le garage : " + garage.countVehicles());
        }
    }
}
