import java.util.Arrays;
import java.util.Scanner;

public class KDiagonalDifference {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());

        int[][] matrix = fillMatrix(n);

        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - 1 - i];
        }

        System.out.println(Math.abs(mainDiagonalSum - secondaryDiagonalSum));
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
}
