public class Arguments {
    // Exemple qui calcule l'aide d'un cercle
    public static void main(String[] args) {
        double radius = Double.parseDouble(args[0]);
        double pi = 3.1416;
        double area = pi * radius * radius;
        System.out.println("l'aire d'un cercle avec rayon " +
                radius + " est " + area);
    }
}
