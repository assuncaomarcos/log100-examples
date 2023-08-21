package abstraction;

public class Vehicle extends Machine {
    private int year;
    private boolean on;

    public Vehicle(String brand, String model) {
        super.setBrand(brand);
        super.setModel(model);
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
                super.getBrand(), super.getModel(), this.year,
                this.on ? "démarré" : "arreté");
    }

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Vehicle && super.equals(obj)) {
            Vehicle other = (Vehicle) obj;
            ret = this.year == other.year && this.on == this.on;
        }
        return ret;
    }
}