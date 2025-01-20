import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int greatestCommonDivisor(int a, int b) {
        if (a < 0 || b < 0) {
            return 1;
        }

        if (a == 0 || b == 0) {
            return 0;
        }

        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = greatestCommonDivisor(a, b);
        System.out.println(result);
    }
}
