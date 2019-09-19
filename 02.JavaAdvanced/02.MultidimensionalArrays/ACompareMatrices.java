import java.util.Arrays;
import java.util.Scanner;

public class ACompareMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensionsA = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrixA = new int[dimensionsA[0]][dimensionsA[1]];
        fillMatrix(matrixA, sc);

        int[] dimensionsB = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[][] matrixB = new int[dimensionsB[0]][dimensionsB[1]];
        fillMatrix(matrixB, sc);

        if (checkEquality(matrixA, matrixB)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static void fillMatrix(int[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            int[] tempRow = Arrays.stream(sc.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = tempRow[col];
            }
        }
    }

    private static boolean checkEquality(int[][] matrixA, int[][] matrixB) {
        if (matrixA.length != matrixB.length) {
            return false;
        }

        for (int rows = 0; rows < matrixA.length; rows++) {
            if (matrixA[rows].length != matrixB[rows].length) {
                return false;
            }
            for (int cols = 0; cols < matrixA[rows].length; cols++) {
                if (matrixA[rows][cols] != matrixB[rows][cols]) {
                    return false;
                }
            }
        }

        return true;
    }
}
