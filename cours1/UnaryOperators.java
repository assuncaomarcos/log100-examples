public class UnaryOperators {

    public static void main(String[] args){
        int y = 20, result;

        // post-incrémentation:
        result = y++;
        System.out.println("y = " + y + ", result = " + result);

        // post-décrémentation
        result = y--;
        System.out.println("y = " + y + ", result = " + result);

        // pre-incrémentation:
        result = ++y;
        System.out.println("y = " + y + ", result = " + result);

        // pre-décrémentation
        result = --y;
        System.out.println("y = " + y + ", result = " + result);
    }
}
