package company;

import java.util.Scanner;

public class pAddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        int sum = addNumbers(first, second);
        int result = subtractNumbers(sum, third);
        System.out.println(result);
    }

    private static int subtractNumbers(int first, int second) {
        return first - second;
    }

    private static int addNumbers(int first, int second) {
        return first + second;
    }
}
