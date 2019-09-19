import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OCrossfire {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();

        ArrayList<ArrayList<Integer>> matrix = generateMatrix(rows, cols);

        String input = sc.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int[] tokens = Arrays.stream(input.split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            int row = tokens[0];
            int col = tokens[1];
            int radius = tokens[2];

            for (int r = row - radius; r <= row + radius; r++) {
                if (isInBounds(matrix, r, col)) {
                    matrix.get(r).set(col, 0);
                }
            }

            for (int c = col - radius; c <= col + radius; c++) {
                if (isInBounds(matrix, row, c)) {
                    matrix.get(row).set(c, 0);
                }
            }

            for (int r = 0; r < matrix.size(); r++) {
                matrix.set(r, matrix.get(r)
                        .stream()
                        .filter(e -> e != 0)
                        .collect(Collectors.toCollection(ArrayList::new)));
                if (matrix.get(r).size() == 0) {
                    matrix.remove(r);
                    r--;
                }
            }

            input = sc.nextLine();
        }

        printMatrix(matrix);
    }

    private static ArrayList<ArrayList<Integer>> generateMatrix(int rows, int cols) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        int value = 1;
        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(value);
                value++;
            }
            matrix.add(row);
        }

        return matrix;
    }

    private static void printMatrix(ArrayList<ArrayList<Integer>> matrix) {
        for (int r = 0; r < matrix.size(); r++) {
            for (int c = 0; c < matrix.get(r).size(); c++) {
                System.out.print(matrix.get(r).get(c) + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(ArrayList<ArrayList<Integer>> matrix, int row, int col) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }
}
