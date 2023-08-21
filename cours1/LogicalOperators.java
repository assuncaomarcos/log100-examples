public class LogicalOperators {

    public static void main(String[] args){
        int x = 10, y = 20, z = 10;

        if ( x < y && x == z) {
            System.out.println("x est inferieur a y et egal a z");
        }

        if ( x < y && y == z) {
            System.out.println("x est inferieur a y et y est egal a z");
        }

        if ( y == z || x < y) {
            System.out.println("y est egal a z ou x est inferieur a y");
        }

        if ( !(x == y) ) {
            System.out.println("x est different de y");
        }
    }
}
