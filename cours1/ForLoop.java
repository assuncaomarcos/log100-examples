public class ForLoop {
    public static void main(String[] args) {
        int[] myList = {4, 6, 8, 1, 5, 3};

        for (int i = 0 ; i < myList.length; i++) {
            System.out.println("Element " + i + " = " + myList[i]);
        }

        for (int elem : myList) {
            System.out.println(elem);
        }
    }
}
