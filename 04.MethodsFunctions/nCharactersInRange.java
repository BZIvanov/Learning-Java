package company;

import java.util.Scanner;

public class nCharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);

        System.out.println(getCharsInRange(first, second));
    }

    public static String getCharsInRange(char start, char end) {
        String result = "";

        if (end < start) {
            char temp = end;
            end = start;
            start = temp;
        }

        for (int i = start + 1; i < end; i++) {
            result += (char) i + " ";
        }

        return result.trim();
    }
}
