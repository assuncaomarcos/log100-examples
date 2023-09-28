import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            int minj = i;
            for (int j = i + 1; j < tableau.length; j++) {
                if (tableau[j] < tableau[minj]) {
                    minj = j;
                }
            }

            int oldValue = tableau[i];
            int newValue = tableau[minj];

            if (oldValue != newValue) {
                tableau[i] = newValue;
                tableau[minj] = oldValue;
            }
        }
    }

    public static void main(String args[]) {

        int[] data = {-2, 45, 0, 11, -9};

        // call method using class name
        SelectionSort.selectionSort(data);

        System.out.println("Tableau trié en ordre croissant :");
        System.out.println(Arrays.toString(data));
    }
}
