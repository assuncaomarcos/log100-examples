public class Break {
    public static void main(String[] args) {
        int x = 1;

        System.out.println("break dans une boucle while");
        while (x <= 10) {
            if (x == 4) {
                break;
            }
            System.out.println("x = " + x);
            x++;
        }

        // Lorsque le break est utilisée à l'intérieur d'une boucle imbriquée,
        // il ne provoque la sortie que de la boucle la plus interne
        System.out.println("\nbreak dans une boucle imbriquée");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 1) {
                    break;
                }
                System.out.println("j = " + j);
            }
            System.out.println("i = " + i);
        }
    }
}
