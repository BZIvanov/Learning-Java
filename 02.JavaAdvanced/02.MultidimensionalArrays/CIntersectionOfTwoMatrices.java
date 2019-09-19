import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CIntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());

        char[][] matrixA = new char[rows][cols];
        char[][] matrixB = new char[rows][cols];
        fillMatrix(matrixA, sc);
        fillMatrix(matrixB, sc);

        char[][] result = new char[rows][cols];
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                if (matrixA[i][j] == matrixB[i][j]) {
                    result[i][j] = matrixA[i][j];
                } else {
                    result[i][j] = '*';
                }
            }
        }

        printMatrix(result);
    }

    private static void fillMatrix(char[][] matrix, Scanner sc) {
        for (int row = 0; row < matrix.length; row++) {
            String[] tempRow = sc.nextLine().split(" ");
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = tempRow[col].charAt(0);
            }
        }
    }

    private static void printMatrix(char[][] result) {
        for (char[] row : result) {
            System.out.println(Arrays.toString(row).replaceAll("\\[|\\]|,", ""));
        }
    }
}
