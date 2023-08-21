public class CircleMethod {

    static double circleArea(double radius) {
        double pi = 3.1416;
        return pi * radius * radius;
    }

    static void printCircleInfo(double radius, double area) {
        System.out.println("l'aire d'un cercle avec rayon " +
                radius + " est " + area);
    }

    public static void main(String[] args) {
        double radius = 1d;
        double area = circleArea(radius);
        printCircleInfo(radius, area);

        radius = 2d;
        area = circleArea(radius);
        printCircleInfo(radius, area);
    }
}
