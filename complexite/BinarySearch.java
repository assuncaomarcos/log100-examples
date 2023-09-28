public class BinarySearch {

    // renvoie l'indice où se trouve la valeur recherchée
    // Sinon, -1 si la valeur n'est pas contenue dans le tableau
    static int binarySearch(int element, int[] tableau) {
        int limInferieure = 0;
        int limSuperieure = tableau.length - 1;

        // On commence la boucle ou on augmente la valeur au milieu
        // entre la limite supérieure et la limite inférieure
        while (limInferieure <= limSuperieure) {
            // On trouve l'indice entre la limite supérieure et inférieure
            int milieu = (limSuperieure + limInferieure) / 2;

            // on regarde la valeur au milieu
            int valueMilieu = tableau[milieu];

            // Si la valeur au milieu est celle qu'on cherche, c'est fini
            // Sinon, on change la limite inférieure ou supérieure
            if (element == valueMilieu) {
                return milieu;
            } else if (element < valueMilieu) {
                limSuperieure = milieu - 1;
            } else if (element > valueMilieu) {
                limInferieure = milieu + 1;
            }
        }

        // Si on a réduit les limites jusqu'à ce qu'elles se rejoignent,
        // le tableau ne contient pas la valeur qu'on cherche
        return -1;
    }

    public static void main(String[] args) {
        int index = binarySearch(7, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        System.out.println("Indice : " + index);
    }
}
