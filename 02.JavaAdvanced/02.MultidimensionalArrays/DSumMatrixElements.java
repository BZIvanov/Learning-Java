import java.util.Arrays;
import java.util.Scanner;

public class DSumMatrixElements {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] dims = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = fillMatrix(dims[0], dims[1]);

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);

        long sum = 0L;
        for (int[] ints : matrix) {
            sum += Arrays.stream(ints).sum();
        }
        System.out.println(sum);
    }

    private static int[][] fillMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int row = 0; row < matrix.length; row++) {
            int[] tempRow = Arrays.stream(sc.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = tempRow[col];
            }
        }
        return matrix;
    }
}
