import java.util.Arrays;
import java.util.Scanner;

public class LMaximalSum {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = fillMatrix(values[0], values[1]);

        int max = 0;
        int rowIndex = 0;
        int colIndex = 0;
        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int currentSub = checkMaxSubmatrix(matrix, row, col);
                if (currentSub > max) {
                    max = currentSub;
                    rowIndex = row;
                    colIndex = col;
                }
            }
        }

        System.out.println("Sum = " + max);
        printMatrix(matrix, rowIndex, colIndex);
    }

    private static int[][] fillMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            int[] tempRow = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = tempRow;
        }
        return matrix;
    }

    private static int checkMaxSubmatrix(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int r = row; r < row + 3; r++) {
            for (int c = col; c < col + 3; c++) {
                sum += matrix[r][c];
            }
        }
        return sum;
    }

    private static void printMatrix(int[][] matrix, int r, int c) {
        for (int row = r; row < r + 3; row++) {
            for (int col = c; col < c + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
