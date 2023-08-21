package cours2;

import java.util.Arrays;

public class RandomNumber {

    public static final void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int length = Integer.parseInt(args[1]);

        int[] numbers = new int[length];
        for (int i = 0; i < length; i++) {
            numbers[i] = (int)(Math.random() * number);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
