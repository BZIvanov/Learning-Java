import java.util.Arrays;
import java.util.Scanner;

public class JMatrixOfPalindromes {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String[][] matrix = fillMatrix(values[0], values[1]);

        printMatrix(matrix);
    }

    private static String[][] fillMatrix(int r, int c) {
        String[][] matrix = new String[r][c];
        char letter = 'a';
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                matrix[row][col] = String.format("%c%c%c", letter + row, letter + row + col, letter + row);
            }
        }
        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        Arrays.stream(matrix).forEach(e -> {
            for (int i = 0; i < e.length; i++) {
                System.out.print(e[i] + " ");
            }
            System.out.println();
        });
    }
}
