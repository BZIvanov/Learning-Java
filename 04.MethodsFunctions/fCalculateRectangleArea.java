package company;

import java.util.Scanner;

public class fCalculateRectangleArea {

    static double calculateArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        System.out.printf("%.0f", calculateArea(a, b));
    }
}
