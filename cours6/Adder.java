import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class MathOperation {

}

/**
 * <h1>Calculer la somme de deux nombres</h1>
 * Le programme Adder implémente une application qui
 * somme deux nombres donnés et imprime la sortie à l'écran.
 * Regardez {@link MathOperation} pour plus de détails
 * sur quelques opérations mathématiques.
 *
 * @author  Jessica Campbell Jones Cage
 * @version 1.0
 * @since   2022-02-01
 */
public class Adder extends MathOperation {

    /**
     * Cette méthode somme deux nombres. C'est une facon de
     * montrer l'utilisation des balises javadoc.
     * @param n1 le premier paramètre de la méthode add
     * @param n2 le deuxième paramètre de la méthode add
     * @return double renvoie la somme de n1 et n2.
     */
    public double add(double n1, double n2) {
        return n1 + n2;
    }

    /**
     * La méthode principale du programme qui utilise add.
     * @param args pas utilisé.
     * @throws InputMismatchException - si les nombres saisis ne sont pas doubles
     * @throws NoSuchElementException - si rien n'est saisie
     * @throws IllegalStateException - si le programme n'arrive pas à lire les entrées claviers
     * @see InputMismatchException
     * @see NoSuchElementException
     * @see IllegalStateException
     */

    public static void main(String args[]) throws InputMismatchException,
            NoSuchElementException, IllegalStateException {
        Adder adder = new Adder();
        Scanner keyboard = new Scanner(System.in);
        double n1, n2;

        System.out.println("Saisir le premier nombre: ");
        n1 = keyboard.nextDouble();
        System.out.println("Saisir le deuxieme nombre: ");
        n2 = keyboard.nextDouble();

        double sum = adder.add(n1, n2);
        System.out.printf("La somme de %.2f et %.2f est %.2f", n1, n2, sum);
    }
}
