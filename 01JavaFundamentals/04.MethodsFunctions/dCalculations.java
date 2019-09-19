package company;

import java.util.Scanner;

public class dCalculations {

    static void add(int first, int second) {
        System.out.printf("%d", first + second);
    }

    static void multiply(int first, int second) {
        System.out.printf("%d", first * second);
    }

    static void subtract(int first, int second) {
        System.out.printf("%d", first - second);
    }

    static void divide(int first, int second) {
        System.out.printf("%d", first / second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String op = sc.nextLine();
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());

        switch (op) {
            case "add": add(first, second); break;
            case "multiply": multiply(first, second); break;
            case "subtract": subtract(first, second); break;
            case "divide": divide(first, second); break;
        }
    }
}
