package abstraction;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    public int getNumberOfDoors() {
        return this.numDoors;
    }

    public String toString() {
        return "Voiture à " + this.numDoors + " portes " + super.toString();
    }
}