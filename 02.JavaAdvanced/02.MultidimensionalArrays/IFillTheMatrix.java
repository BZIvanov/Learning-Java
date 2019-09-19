import java.util.Arrays;
import java.util.Scanner;

public class IFillTheMatrix {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] tokens = sc.nextLine().split(", ");
        int size = Integer.parseInt(tokens[0]);
        String type = tokens[1];

        switch (type) {
            case "A":
                printMatrix(fillTypeA(size));
                break;
            case "B":
                printMatrix(fillTypeB(size));
                break;
                default:
                    System.out.println("invalid type");
                    break;
        }
    }

    private static int[][] fillTypeA(int size) {
        int[][] result = new int[size][size];

        for (int row = 0; row < size; row++) {
            int colValue = row + 1;
            for (int col = 0; col < size; col++) {
                result[row][col] = colValue;
                colValue += size;
            }
        }
        return result;
    }

    private static int[][] fillTypeB(int size) {
        int[][] result = new int[size][size];

        for (int row = 0; row < size; row++) {
            int colValue = row + 1;
            for (int col = 0; col < size; col++) {
                if (col % 2 == 0) {
                    result[row][col] = colValue;
                } else {
                    result[size - 1 - row][col] = colValue;
                }
                colValue += size;
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix).forEach(e -> {
            for (int i = 0; i < e.length; i++) {
                System.out.print(e[i] + " ");
            }
            System.out.println();
        });
    }
}
