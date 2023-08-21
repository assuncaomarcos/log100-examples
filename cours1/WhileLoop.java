public class WhileLoop {
    public static void main(String[] args) {
        int x;

        System.out.println("Exemple de boucle while");
        x = 1; // initialisation
        while (x <= 10) {  // condition
            System.out.println("x = " + x);

            // mise à jour
            x++;
        }

        System.out.println("Exemple de boucle do while");
        x = 1; // initialisation
        do {  // condition
            System.out.println("x = " + x);

            // mise à jour
            x++;
        } while (x <= 10);
    }
}
