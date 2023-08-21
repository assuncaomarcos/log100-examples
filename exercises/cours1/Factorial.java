package cours1;

public class Factorial {
    public static void main(String[] args) {
        int i = 1;          // compteur pour la boucle
        int fact = 1;       // pour stocker la factorielle
        int target = 10;    // le nombre entier dont la factorielle on veut calculer

        while (i <= target) {
            fact *= i;      // le même que: fact = fact * i
            i++;            // le même que: i = i + 1
        }
        System.out.println("La factoriel de " + target + " est " + fact);
    }
}