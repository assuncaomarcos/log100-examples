public class RecursiveBinarySearch {
    static int binarySearch(int elem, int inf, int sup, int[] tableau) {
        if (sup >= inf) {
            int milieu = inf + (sup - inf) / 2;

            if (tableau[milieu] == elem)
                return milieu;
            if (tableau[milieu] > elem)
                return binarySearch(elem, inf, sup - 1, tableau);

            return binarySearch(elem, milieu + 1, sup, tableau);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] tab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = binarySearch(7, 0, tab.length - 1, tab);
        System.out.println("Indice : " + index);
    }
}
