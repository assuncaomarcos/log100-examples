package cours4;

import java.util.Arrays;

public class SwapArrayElements {

    private static <T> void swapElements(T[] tab, int i, int j) {
        T aux = tab[i];
        tab[i] = tab[j];
        tab[j] = aux;
    }

    public static void main(String[] args) {
        String[] tab = new String[]{"a","b","c","d","e"};
        swapElements(tab, 0, 1);

        System.out.println(Arrays.toString(tab));
    }
}
