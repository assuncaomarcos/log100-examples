class TriangleException {
    static double calcArea(double base, double height)
            throws Exception {
        if (base <= 0 ) {
            throw new Exception("Base est zero");
        }
        if (height == 0) {
            throw new Exception("Hauteur est zero");
        }
        if (base < 0) {
            throw new Exception("Base est zero");
        }
        if (height < 0) {
            throw new Exception("Base est zero");
        }
        return base * height / 2d;
    }
}

public class TriangleWithException {

    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        try {
            double area = TriangleException.calcArea(base, height);
            System.out.println("L'aire d'un triangle avec largeur de base " +
                    base + " et hauteur " + height + " est " + area);
        } catch (Exception exception) {
            System.out.println("Erreur: " + exception.getMessage());
        }
    }
}