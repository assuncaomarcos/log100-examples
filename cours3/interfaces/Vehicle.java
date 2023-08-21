package interfaces;

public class Vehicle extends Machine implements Repairable, GPS {
    private int year;
    private boolean on;
    private boolean inRepair;
    private float minRepairCost;

    public Location getCoordinates() {
        return new Location(45.50884f, -73.58781f);
    }

    public boolean isInRepair() {
        return this.inRepair;
    }

    public void setInRepair(boolean inRepair) {
        this.inRepair = inRepair;
    }

    public void setMinimumRepairCost(float cost) {
        this.minRepairCost = cost;
    }

    public float getMinimumRepairCost() {
        return this.minRepairCost;
    }

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