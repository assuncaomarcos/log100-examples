public class Calculator {
    public static final double PI = 3.1416;

    public static double triangleArea(double base, double height) {
        return base * height / 2d;
    }

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }
}
