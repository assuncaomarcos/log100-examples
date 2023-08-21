public class TernaryOperator {
    public static void main(String[] args) {
        boolean condition = true;
        int x = 5; int y = 10; int result;

        result = condition ? x : y;
        System.out.println("result = " + result);

        System.out.println(x > y ? x : y);
    }
}
