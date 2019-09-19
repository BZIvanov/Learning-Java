import java.util.Arrays;
import java.util.Scanner;

public class EMaximumSumSubmatrix {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] dims = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = fillMatrix(dims[0], dims[1]);

        int maxSum = 0;
        int[] winningStartIndex = new int[2];
        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int horizontalFirst = matrix[row][col] + matrix[row][col + 1];
                int horizontalSecond = matrix[row + 1][col] + matrix[row + 1][col + 1];
                int subSum = horizontalFirst + horizontalSecond;
                if (subSum > maxSum) {
                    maxSum = subSum;
                    winningStartIndex[0] = row;
                    winningStartIndex[1] = col;
                }
            }
        }

        for (int i = winningStartIndex[0]; i <= winningStartIndex[0] + 1; i++) {
            for (int j = winningStartIndex[1]; j <= winningStartIndex[1] + 1; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(maxSum);
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
