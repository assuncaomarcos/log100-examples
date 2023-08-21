package cours2;

public class FindElement {

    public static boolean contains(int[] tab, int element) {
        for (int item : tab) {
            if (item == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] tab = {
                4417, 5815, 2748, 1339, 5319,
                4701, 3438, 8822, 6972, 4880,
                8186, 2503, 6737, 3596, 1619};

        System.out.println(contains(tab, 1339));
        System.out.println(contains(tab, 2015));
    }
}
