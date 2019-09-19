import java.util.Arrays;
import java.util.Scanner;

public class HWrongMeasurements {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = fillMatrix(n);

        int[] target = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int targetNumber = matrix[target[0]][target[1]];
        int[][] result = new int[matrix.length][matrix[0].length];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == targetNumber) {
                    updateResult(matrix, result, row, col, targetNumber);
                } else {
                    result[row][col] = matrix[row][col];
                }
            }
        }

        printMatrix(result);
    }

    private static int[][] fillMatrix(int r) {
        int[][] matrix = new int[r][];
        for (int row = 0; row < r; row++) {
            int[] tempRow = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = tempRow;
        }
        return matrix;
    }

    private static void updateResult(int[][] matrix, int[][] result, int row, int col, int target) {
        int top = 0;
        if (row > 0 && target != matrix[row - 1][col]) {
            top += matrix[row - 1][col];
        }
        int bottom = 0;
        if (row < matrix.length - 1 && target != matrix[row + 1][col]) {
            bottom += matrix[row + 1][col];
        }
        int left = 0;
        if (col > 0 && target != matrix[row][col - 1]) {
            left += matrix[row][col - 1];
        }
        int right = 0;
        if (col < matrix[row].length - 1 && target != matrix[row][col + 1]) {
            right += matrix[row][col + 1];
        }

        result[row][col] = top + bottom + left + right;
    }

    private static void printMatrix(int[][] result) {
        Arrays.stream(result).forEach(x -> {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        });
    }
}
