public class UseCalculator {
    // Exemple qui utilise les methodes publiques de Calculator
    public static void main(String[] args) {
        double areaCircle = Calculator.circleArea(2d);
        double areaTriangle = Calculator.triangleArea(3d, 5d);
        System.out.println("La valeur de PI : " + Calculator.PI);
        System.out.println("Aire du cercle : " + areaCircle);
        System.out.println("Aire du triangle : " + areaTriangle);
    }
}
