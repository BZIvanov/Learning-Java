import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] dims = Arrays.stream(sc.nextLine().split(" "))
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
        for (int[] ints : matrix) {
            int[] tempRow = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.arraycopy(tempRow, 0, ints, 0, ints.length);
        }
        return matrix;
    }
}
