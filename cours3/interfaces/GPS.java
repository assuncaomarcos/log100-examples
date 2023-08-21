package interfaces;

class Location {
    float latitude;
    float longitude;

    Location(float latitude, float longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

public interface GPS {
    Location getCoordinates();

    default Location getRoughCoordinates() {
        return new Location(45.50884f, -73.58781f);
    }
}
