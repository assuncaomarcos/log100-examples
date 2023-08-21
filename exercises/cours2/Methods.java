package cours2;

public class Methods {

    private static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    private static double max(double ...args) {
        double max = args.length > 0 ? args[0] : Double.NaN;
        for (int i = 1; i < args.length; i++) {
            if (args[i] > max) {
                max = args[i];
            }
        }
        return max;
    }

    private static String inverse(String str) {
        int length = str.length();
        char[] characters = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            characters[length - 1 - i] = str.charAt(i);
        }
        return String.valueOf(characters);
    }

    public static void main(String[] args) {
        double a = 3, b = 5, c = 4;
        System.out.println("Moyenne: " + mean(a, b, c));
        System.out.println("Max: " + max(a, b, c));
        System.out.println("Chaine inversée: " + inverse("Salut tout le monde!"));
    }
}