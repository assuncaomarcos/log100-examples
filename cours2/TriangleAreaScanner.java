import java.util.Scanner;

public class TriangleAreaScanner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double base, height, area;

        System.out.println("Saisir la largeur de base: ");
        base = keyboard.nextDouble();
        System.out.println("Saisir la hauteur: ");
        height = keyboard.nextDouble();

        area = base * height / 2d;
        System.out.println("L'aire d'un triangle " +
                "avec largeur de base " + base +
                " et hauteur " + height + " est " + area);
    }
}
