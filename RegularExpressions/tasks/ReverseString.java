import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        while (!"end".equals(line)) {
            StringBuilder reversed = new StringBuilder();
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed.append(line.charAt(i));
            }
            System.out.printf("%s = %s%n", line, reversed.toString());

            line = sc.nextLine();
        }

        sc.close();
    }
}
