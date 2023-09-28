public class TowerOfHanoi {
    static void hanoi(int n, char depart, char arrive, char aux) {
        if (n != 0) {
            hanoi(n - 1, depart, aux, arrive);
            System.out.printf("Déplacer le disque" +
                            " %d de %c vers %c \n",
                    n, depart, arrive);
            hanoi(n - 1, aux, arrive, depart);
        }
    }

    public static void main(String[] args) {
        int n = 4;  // Le nombre de disques

        // A, B et C sont les noms des tours
        hanoi(n, 'A', 'C', 'B');
    }
}
