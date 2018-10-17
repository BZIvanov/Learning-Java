package company;

import java.util.Scanner;

public class sStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = Integer.parseInt(sc.nextLine());

        int number = input;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            int factorial = 1;

            for(int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            sum += factorial;
        }

        if(sum == input) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
