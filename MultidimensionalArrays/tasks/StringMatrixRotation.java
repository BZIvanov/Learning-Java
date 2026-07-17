import java.util.ArrayList;
import java.util.Scanner;

public class StringMatrixRotation {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int angle = Integer.parseInt(sc.nextLine());

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
                for (char[] chars : matrix) {
                    System.out.print(chars[c]);
                }
                System.out.println();
            }
        } else {
            for (char[] chars : matrix) {
                for (int c = 0; c < maxWordLength; c++) {
                    System.out.print(chars[c]);
                }
                System.out.println();
            }
        }
    }
}
