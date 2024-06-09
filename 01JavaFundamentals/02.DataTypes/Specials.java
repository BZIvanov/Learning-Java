import java.util.Scanner;

public class Specials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        boolean toe;
        for (int ch = 1; ch <= n; ch++) {
            int sum = 0;
            int nums = ch;
            while (nums > 0) {
                sum += nums % 10;
                nums = nums / 10;
            }
            toe = (sum == 5) || (sum == 7) || (sum == 11);
            String special = toe + "";
            special = (special.charAt(0) + "").toUpperCase() + special.substring(1);
            System.out.printf("%d -> %s%n", ch, special);
        }
    }
}
