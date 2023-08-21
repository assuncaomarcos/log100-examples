
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int line = 0; line < matrix.length; line++) {
            for (int col = 0; col < matrix[line].length; col++) {
                System.out.printf("matrix[%d][%d] = %d \n", line, col, matrix[line][col]);
            }
        }
    }
}
