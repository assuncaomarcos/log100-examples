public class TriangleArea {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = base * height / 2d;
        System.out.println("L'aire d'un triangle avec largeur de base " +
                base + " et hauteur " + height + " est " + area);
    }
}
