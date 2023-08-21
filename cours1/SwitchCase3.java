public class SwitchCase3 {
    public static void main(String[] args) {
        int day = 2;

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("J'attends le week-end avec impatience");
            case 6 -> System.out.println("Samedi");
            case 7 -> System.out.println("Dimanche");
            default -> System.out.println("Jour invalide");
        }
    }
}
