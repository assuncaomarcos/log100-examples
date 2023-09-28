public class SimpleSearch {
    public static boolean searchElement(int element, int[] tableau) {
        for (int i = 0; i < tableau.length; i++)
            if (element == tableau[i])
                return true;

        return false;
    }

    public static void main(String[] args) {
        searchElement(5, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }
}
