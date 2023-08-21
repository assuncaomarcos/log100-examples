package cours2;

import java.util.Arrays;

public class ArrayMerge {

    public static final void main(String[] args) {
        int[] arr1 = {1, 4, 7, 12, 20};
        int[] arr2 = {10, 15, 17, 33};

        int[] res = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            res[arr1.length + i] = arr2[i];
        }

        Arrays.sort(res);
        System.out.println(Arrays.toString(res));
    }
}
