package company;

        import java.util.Scanner;

public class tPalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.nextLine();

        while (!num.equals("END")) {
            System.out.println(checkForPalindrome(num));
            num = sc.nextLine();
        }
    }

    private static boolean checkForPalindrome(String num) {
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) != num.charAt(num.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
