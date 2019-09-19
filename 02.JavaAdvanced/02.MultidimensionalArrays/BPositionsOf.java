import java.util.Arrays;
import java.util.Scanner;

public class BPositionsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dimensions = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[][] matrix = new int[dimensions[0]][dimensions[1]];
        fillMatrix(matrix, sc);
        int searchedItem = Integer.parseInt(sc.nextLine());

        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchedItem) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }

        if (!isFound) {
            System.out.println("not found");
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
}
