public class CallByReference {
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

    static void incrementArray(int[] list, int inc) {
        for (int i = 0; i < list.length; i++) {
            list[i] += inc;
        }
    }

    public static void main(String[] args) {
        int[] larray = createArray(5, 1);
        printArray(larray);
        incrementArray(larray, 2);
        printArray(larray);
    }
}
