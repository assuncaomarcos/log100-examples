package interfaces;

import java.util.Comparator;

public class ComparatorVehicle implements Comparator<Vehicle> {

    public int compare(Vehicle v1, Vehicle v2) {
        int result = -1;
        if (v1.getYear() == v2.getYear()) {
            result = 0;
        } else if (v1.getYear() > v2.getYear()) {
            result = 1;
        }
        return result;
    }
}
