import java.util.Scanner;

public class FindRealQueen {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] matrix = fillMatrix();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    boolean h = checkLeftAndRight(matrix, i, j);
                    boolean v = checkTopAndBottom(matrix, i, j);
                    boolean m = checkMainDiagonal(matrix, i, j);
                    boolean s = checkSecondaryDiagonal(matrix, i, j);

                    if (h && v && m && s) {
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
        }
    }

    private static char[][] fillMatrix() {
        char[][] matrix = new char[8][8];
        for (int row = 0; row < 8; row++) {
            String[] tempRow = sc.nextLine().split(" ");
            for (int col = 0; col < 8; col++) {
                matrix[row][col] = tempRow[col].charAt(0);
            }
        }
        return matrix;
    }

    private static boolean checkLeftAndRight(char[][] matrix, int i, int j) {
        for (int cols = 0; cols < 8; cols++) {
            if (cols == j) {
                // continue will skip the current iteration and continue with the next one
                continue;
            }
            if (matrix[i][cols] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkTopAndBottom(char[][] matrix, int i, int j) {
        for (int rows = 0; rows < 8; rows++) {
            if (rows == i) {
                continue;
            }
            if (matrix[rows][j] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkMainDiagonal(char[][] matrix, int i, int j) {
        for (int d = 1; d < 8; d++) {
            if ((i - d < 0) || (j - d < 0)) {
                break;
            }
            if (matrix[i - d][j - d] == 'q') {
                return false;
            }
        }
        for (int d = 1; d < 8; d++) {
            if ((i + d >=  8) || (j + d >= 8)) {
                break;
            }
            if (matrix[i + d][j + d] == 'q') {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSecondaryDiagonal(char[][] matrix, int i, int j) {
        for (int d = 1; d < 8; d++) {
            if ((i - d < 0) || (j + d >= 8)) {
                break;
            }
            if (matrix[i - d][j + d] == 'q') {
                return false;
            }
        }
        for (int d = 1; d < 8; d++) {
            if ((i + d >=  8) || (j - d < 0)) {
                break;
            }
            if (matrix[i + d][j - d] == 'q') {
                return false;
            }
        }
        return true;
    }
}
