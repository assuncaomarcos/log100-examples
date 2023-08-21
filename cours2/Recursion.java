public class Recursion {

    // produit la somme de tous le
    // nombres entiers de 0 à x
    static int sumNumbers(int x) {
        if (x > 0) {
            return x + sumNumbers(x - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int sum = sumNumbers(15);
        System.out.println("Résultat = " + sum);
    }
}
