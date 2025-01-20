import java.util.Scanner;

public class ReverseNumber {
    public static int reverseNumber(int number) {
        if (number < 0) {
            return -1;
        }

        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        int result = reverseNumber(number);
        System.out.println(result);
    }
}
