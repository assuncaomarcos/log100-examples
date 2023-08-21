class Triangle {
    static double calcArea(double base, double height) {
        if (base == 0 ) return -1;
        if (height == 0) return -2;
        if (base < 0) return -3;
        if (height < 0) return -4;
        return base * height / 2d;
    }
}

public class TriangleWithoutException {
    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = Triangle.calcArea(base, height);

        System.out.println("L'aire d'un triangle avec largeur de base " +
                base + " et hauteur " + height + " est " + area);
    }
}

