package abstraction;

public abstract class Machine {

    public abstract void start();
    public abstract void stop();
    public abstract boolean isOn();

    private String brand;
    private String model;

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

    public boolean equals(Object obj) {
        boolean ret = false;
        if (obj instanceof Machine) {
            Machine other = (Machine) obj;
            return other instanceof Machine &&
                    this.brand.equals(other.brand) &&
                    this.model.equals(other.model);
        }
        return ret;
    }
}
