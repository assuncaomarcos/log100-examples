package inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private boolean on;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Vehicle(String brand, String model, int year) {
        this(brand, model);
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void start() {
        this.on = true;
    }

    public void stop() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public String toString() {
        return String.format("%s %s %d est %s",
                this.brand, this.model, this.year,
                this.on ? "démarré" : "arreté");
    }

    public boolean equals(Object obj) {
        Vehicle other = (Vehicle) obj;
        boolean result = false;
        if (obj instanceof Vehicle) {
            result = (this.brand.equals(other.brand) &&
                    this.model.equals(other.model) &&
                    this.year == other.year &&
                    this.on == this.on);
        }
        return result;
    }

    public static final void main(String[] args) {
        Vehicle honda = new Vehicle("Honda", "Civic");
        System.out.println(honda);

        honda.start();
        System.out.println(honda);
    }
}