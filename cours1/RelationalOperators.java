public class RelationalOperators {

    public static void main(String[] args){
        int a = 10, b = 20, c = 10;
        boolean result;

        result = (a == b);
        System.out.println("a == b : " + result);

        result = (a == c);
        System.out.println("a == c : " + result);

        result = (a > b);
        System.out.println("a > b : " + result);

        result = (a <= c);
        System.out.println("a <= c : " + result);

        result = (b >= c);
        System.out.println("b >= c : " + result);

        result = (a != c);
        System.out.println("a != c : " + result);
    }
}
