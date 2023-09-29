package cours4;

import java.util.List;

public class GenericProgram {

//        public static <T> T max(T x, T y) {
//            return x > y ? x : y;
//        }

    public static void print(List<? extends Number> list) {
        for (Number n : list)
            System.out.print(n + " ");
        System.out.println();
    }
}
