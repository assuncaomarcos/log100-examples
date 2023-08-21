package abstraction;

public class Truck extends Vehicle {
    private int numAxles;

    public Truck(String brand, String model, int year, int numAxles) {
        super(brand, model, year);
        this.numAxles = numAxles;
    }

    public int getNumAxles() {
        return this.numAxles;
    }

    public String toString() {
        return "Camion à " + this.numAxles + " essieux " + super.toString();
    }
}
