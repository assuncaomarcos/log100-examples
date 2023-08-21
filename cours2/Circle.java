public class Circle {
    // Un attribut de classe
    public static final double PI= 3.1416;

    // Une méthode de classe
    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    // Un attribut d'instance
    public double radius;  // public pour l'instant, mais ce n'est pas bon

    // construteur
    public Circle(double radius) {
        this.radius = radius;
    }

    /* Deux méthodes d'instance qui opèrent
       sur les attributs d'instance */
    public double area() {
        return PI * radius * radius;
    }

    public double circumference() {
       return 2 * PI * radius;
    }
}
