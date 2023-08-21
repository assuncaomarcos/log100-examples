package cours1;

public class Expressions {
    public static final void main(String[] args) {
        boolean result = (5 > 7) && (false || 1 < 9) || 4 != 5 && ! (2 >= 3);
        System.out.println(result);
        result = false && (false || 1 < 9) || 4 != 5 && ! (2 >= 3);
        System.out.println(result);
        result = false && (false || true) || 4 != 5 && ! (2 >= 3);
        System.out.println(result);
        result = false && (false || true) || true && ! (2 >= 3);
        System.out.println(result);
        result = false && (false || true) || true && ! false;
        System.out.println(result);
    }
}
