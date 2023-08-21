public class IterateString {

    public static final void main(String[] args) {
        String salut = "Salut tout le monde";

        for (int i=0; i< salut.length(); i++) {
            System.out.print(salut.charAt(i) + " ");
        }
    }
}
