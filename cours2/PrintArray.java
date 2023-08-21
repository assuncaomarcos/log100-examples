public class PrintArray {

    static void printArray(int[] list) {
        // affiche les éléments du tableau
        for (double elem : list) {
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        int[] values = { 10, 9, 8, 7, 6, 5, 4, 3 };
        printArray(values);
    }
}
