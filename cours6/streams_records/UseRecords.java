package streams_records;

record Point(int x, int y) {
    // Pas besoin de définir les constructeurs, equals(), hashCode(), ou toString()
}

record Apprentice(String firstName, String familyName, int age) {

}

public class UseRecords {

    public static void main(String[] args) {
        // Utilisation de streams_records.Point
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        System.out.println(p1.equals(p2)); // Vrai grâce à equals() généré automatiquement
        System.out.println(p1.toString()); // Affiche streams_records.Point[x=10, y=20]

        // Utilisation de streams_records.Apprentice
        Apprentice app1 = new Apprentice("Élise", "Martin", 18);
        Apprentice app2 = new Apprentice("Lucas", "Dupont", 20);

        // Affiche streams_records.Apprentice[firstName=Élise, familyName=Martin, age=18]
        System.out.println(app1);
        // Affiche streams_records.Apprentice[firstName=Lucas, familyName=Dupont, age=20]
        System.out.println(app2);
    }
}
