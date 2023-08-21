public class ReturnArray {

    static void printArray(int[] list) {
        for (double elem : list) {
            System.out.println(elem);
        }
    }

    static int[] createArray(int size, int value) {
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = value;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] larray = createArray(5, 2);
        printArray(larray);
    }
}
