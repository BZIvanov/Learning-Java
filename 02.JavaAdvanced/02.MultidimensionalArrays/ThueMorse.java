import java.util.Scanner;

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());

        if (n <= 0) {
            System.out.println("The provided integer should be positive.");
            return;
        }

        // Generate Thue-Morse sequence up to length n
        int[] thueMorseSequence = generateThueMorseSequence(n);

        // Generate the n-by-n pattern based on the Thue-Morse sequence
        char[][] pattern = generatePattern(n, thueMorseSequence);

        printPattern(pattern);
    }

    private static int[] generateThueMorseSequence(int n) {
        int[] sequence = new int[n];
        for (int i = 1; i < n; i++) {
            sequence[i] = sequence[i >> 1] ^ (i & 1);
        }
        return sequence;
    }

    private static char[][] generatePattern(int n, int[] sequence) {
        char[][] pattern = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (sequence[i] == sequence[j]) {
                    pattern[i][j] = '+';
                } else {
                    pattern[i][j] = '-';
                }
            }
        }
        return pattern;
    }

    private static void printPattern(char[][] pattern) {
        for (int i = 0; i < pattern.length; i++) {
            for (int j = 0; j < pattern[i].length; j++) {
                System.out.print(pattern[i][j]);
                if (j < pattern[i].length - 1) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
