package com.company;

import java.util.Scanner;

public class kMathOperations {

    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    static double modulo(double a, double b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first = Double.parseDouble(sc.nextLine());
        String op = sc.nextLine();
        double second = Double.parseDouble(sc.nextLine());

        switch (op) {
            case "+":
                System.out.printf("%.0f",add(first, second));
                break;
            case "-":
                System.out.printf("%.0f",subtract(first, second));
                break;
            case "*":
                System.out.printf("%.0f",multiply(first, second));
                break;
            case "/":
                System.out.printf("%.0f",divide(first, second));
                break;
            case "%":
                System.out.printf("%.0f",modulo(first, second));
                break;
        }
    }
}
