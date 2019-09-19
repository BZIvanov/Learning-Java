import java.util.Arrays;
import java.util.Scanner;

public class FPrintDiagonals {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = fillMatrix(n, n);

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[matrix.length - 1 - i][i] + " ");
        }
        System.out.println();
    }

    private static int[][] fillMatrix(int r, int c) {
        int[][] matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            int[] tempRow = Arrays.stream(sc.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = tempRow;
        }
        return matrix;
    }
}
