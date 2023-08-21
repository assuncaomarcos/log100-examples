public class NestingIfElse {
    public static void main(String[] args) {
        int x = 9;
        if (x <= 10) {
            if (x < 0) {
                System.out.println("La valeur de x est négative");
            } else {
                System.out.println("La valeur de x est positive");
            }
        } else {
            System.out.println("La valeur de x est supérieure à 10");
        }
    }
}
