package company;

import java.util.Scanner;

public class sFactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first = Double.parseDouble(sc.nextLine());
        double second = Double.parseDouble(sc.nextLine());

        double divisionResult = fact(first) / fact(second);
        System.out.println(String.format("%.2f", divisionResult));
    }

    public static double fact(double num) {
        if(num < 1) {
            return 1;
        }

        return num * fact(num - 1);
    }
}
