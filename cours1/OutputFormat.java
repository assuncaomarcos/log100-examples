public class OutputFormat {
    public static void main(String[] args) {
        double x = 20000.0 / 3.0;

        System.out.println(x);           // Affiche 6666.666666666667
        System.out.printf("%8.2f", x);   // Affiche 6666.67
    }
}
