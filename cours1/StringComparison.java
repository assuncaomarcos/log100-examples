public class StringComparison {

    public static void main(String[] args) {
        String salut = "Salut tout le Monde!";
        String msg;

        System.out.println(salut.toUpperCase());

        if (salut.substring(0, 5).equalsIgnoreCase("salut")) {
            System.out.println("La chaine commence par salut");
        }
    }
}
