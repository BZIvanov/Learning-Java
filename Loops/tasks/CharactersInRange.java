import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char first = sc.nextLine().charAt(0);
        char second = sc.nextLine().charAt(0);

        System.out.println(getCharsInRange(first, second));

        sc.close();
    }

    public static String getCharsInRange(char start, char end) {
        StringBuilder result = new StringBuilder();

        if (end < start) {
            char temp = end;
            end = start;
            start = temp;
        }

        for (int i = start + 1; i < end; i++) {
            result.append((char) i).append(" ");
        }

        return result.toString().trim();
    }
}
