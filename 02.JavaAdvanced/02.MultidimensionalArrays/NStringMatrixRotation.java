import java.util.ArrayList;
import java.util.Scanner;

public class NStringMatrixRotation {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String degrees = sc.nextLine();
        int angle = Integer.parseInt(degrees.substring(7, degrees.length() - 1)) % 360;

        String input = sc.nextLine();

        ArrayList<String> words = new ArrayList<>();
        int maxWordLength = input.length();
        while (!input.equals("END")) {
            words.add(input);
            input = sc.nextLine();

            if (maxWordLength < input.length()) {
                maxWordLength = input.length();
            }
        }

        char[][] matrix = new char[words.size()][maxWordLength];

        for (int r = 0; r < words.size(); r++) {
            for (int c = 0; c < maxWordLength; c++) {
                if (c > words.get(r).length() - 1) {
                    matrix[r][c] = ' ';
                } else {
                    matrix[r][c] = words.get(r).charAt(c);
                }
            }
        }

        if (angle == 90) {
            for (int c = 0; c < maxWordLength; c++) {
                for (int r = matrix.length - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (angle == 180) {
            for (int r = matrix.length - 1; r >= 0; r--) {
                for (int c = matrix[r].length - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else if (angle == 270) {
            for (int c = maxWordLength - 1; c >= 0; c--) {
                for (int r = 0; r < matrix.length; r++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        } else {
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < maxWordLength; c++) {
                    System.out.print(matrix[r][c]);
                }
                System.out.println();
            }
        }
    }
}
