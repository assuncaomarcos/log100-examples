import java.util.HashMap;

public class Parking {

    public static void main(String[] args) {
        var vehicles = new HashMap<String, Vehicle>();
        vehicles.put("A", new Vehicle("Honda", "Civic", 2020));
        vehicles.put("B", new Vehicle("Honda", "Civic", 2019));
        vehicles.put("C", new Vehicle("Toyota", "Corolla", 2014));
        vehicles.put("D", new Vehicle("Toyota", "Corolla", 2011));
        vehicles.put("E", new Vehicle("Toyota", "Corolla", 2009));
        vehicles.put("F", new Vehicle("International", "Lonestar", 2022));

        // affiche tous les vehicles
        System.out.println(vehicles);

        // supprime le vehicle dan l'emplacement B
        vehicles.remove("B");

        // ajoute un autre vehicle à l'emplacement
        vehicles.put("B", new Vehicle("Tesla", "3", 2021));

        vehicles.forEach((k, v) ->
                System.out.println("clé: " + k + ", valeur: " + v));
    }
}