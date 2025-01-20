import java.util.Scanner;

public class LeastCommonMultiple {
    public static int leastCommonMultiple(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }

        if (a == 0 || b == 0) {
            return 0;
        }

        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int lcm = max;

        while (lcm % min != 0) {
            lcm += max;
        }

        return lcm;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int result = leastCommonMultiple(a, b);
        System.out.println(result);
    }
}
