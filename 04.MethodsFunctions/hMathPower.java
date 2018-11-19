package company;

import java.util.Scanner;

public class hMathPower {

    static double numPower(double n, double p) {
        return Math.pow(n, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = Double.parseDouble(sc.nextLine());
        double p = Double.parseDouble(sc.nextLine());

        System.out.printf("%.0f", numPower(num, p));
    }
}
