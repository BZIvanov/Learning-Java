import java.util.Scanner;

public class MMatrixShuffling {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        String[][] matrix = fillMatrix(rows, cols);

        String input = sc.nextLine();

        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("swap") && tokens.length == 5) {
                int firstRow = Integer.parseInt(tokens[1]);
                int firstCol = Integer.parseInt(tokens[2]);
                int secondRow = Integer.parseInt(tokens[3]);
                int secondCol = Integer.parseInt(tokens[4]);
                if (isInBounds(matrix, firstRow, firstCol) && isInBounds(matrix, secondRow, secondCol)) {
                    String temp = matrix[firstRow][firstCol];
                    matrix[firstRow][firstCol] = matrix[secondRow][secondCol];
                    matrix[secondRow][secondCol] = temp;

                    printMatrix(matrix);
                } else {
                    System.out.println("Invalid input!");
                }
            } else {
                System.out.println("Invalid input!");
            }

            input = sc.nextLine();
        }
    }

    private static String[][] fillMatrix(int r, int c) {
        String[][] matrix = new String[r][c];
        for (int row = 0; row < r; row++) {
            matrix[row] = sc.nextLine().split("\\s+");
        }
        return matrix;
    }

    private static boolean isInBounds(String[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
