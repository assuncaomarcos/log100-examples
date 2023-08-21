public class IfElseIf {

    public static void main(String[] args) {
        int x = 15, y = 10;

        if (x < 0) {
            System.out.print("x est inferieur a 0");
        } else if (x > 0 && y > 10) {
            System.out.print("x est superieur a 0 et y superior a 10");
        } else if (x < 0 || y >= 10) {
            System.out.print("x est inferieur a 0 ou y est superieur ou egal a 10");
        } else {
            System.out.print("Toutes les conditions sont fausses");
        }
    }
}
