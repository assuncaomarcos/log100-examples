class AreaException extends Exception {

    public AreaException(String message) {
        super(message);
    }
}

class TriangleNewException {
    static double calcArea(double base, double height)
            throws AreaException {
        if (base <= 0 ) {
            throw new AreaException("Base est zero");
        }
        if (height == 0) {
            throw new AreaException("Hauteur est zero");
        }
        if (base < 0) {
            throw new AreaException("Base est zero");
        }
        if (height < 0) {
            throw new AreaException("Base est zero");
        }
        return base * height / 2d;
    }
}

public class NewExceptions {

    public static void main(String[] args) {
        double base = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        try {
            double area = TriangleNewException.calcArea(base, height);
            System.out.println("L'aire d'un triangle avec largeur de base " +
                    base + " et hauteur " + height + " est " + area);
        } catch (AreaException exception) {
            System.out.println("Erreur: " + exception.getMessage());
        }
    }
}