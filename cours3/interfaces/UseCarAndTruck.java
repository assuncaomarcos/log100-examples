package interfaces;

public class UseCarAndTruck {

    public static void main(String[] args) {
        Car honda = new Car("Honda", "Civic", 2020, 4);
        Car toyota = new Car("Toyota", "Corolla", 2014, 2);

        Truck international = new Truck("International", "Lonestar", 2020, 4);
        Truck volvo = new Truck("Volvo", "VNR", 2021, 3);

        System.out.println(toyota);
        System.out.println(volvo);

        honda.start();
        international.start();

        System.out.println(honda);
        System.out.println(international);

        if (honda.isOn()) {
            honda.stop();
        }
    }
}
