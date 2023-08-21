import java.util.Scanner;

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name; int age; float height;

        System.out.println("Saisir votre prenom: ");
        name = keyboard.nextLine();
        System.out.println("Saisir votre age: ");
        age = keyboard.nextInt();
        System.out.println("Saisir votre taille em m: ");
        height = keyboard.nextFloat();

        System.out.printf("%s a %d ans et " +
                "taille %2.2f \n", name, age, height);
    }
}
