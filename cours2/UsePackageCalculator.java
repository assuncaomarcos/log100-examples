import mypackage.Calculator;
import mypackage.multiply.CalcMultiply;

public class UsePackageCalculator {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        CalcMultiply mult = new CalcMultiply();

        System.out.println(calc.add(2f, 3f));
        System.out.println(mult.multiply(2f, 3f));
    }
}
