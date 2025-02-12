import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            if (divideByEight(i) && checkIfContainsOddNumber(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }

    private static boolean checkIfContainsOddNumber(int num) {
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            if (digit % 2 != 0) {
                return true;
            }
        }

        return false;
    }

    private static boolean divideByEight(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sum += digit;
        }
        
        return sum % 8 == 0;
    }
}
