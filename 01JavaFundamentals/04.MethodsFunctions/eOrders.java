package company;

import java.util.Scanner;

public class eOrders {

    static void calculatePrice(String drink, int quantity) {
        switch (drink) {
            case "coffee":
                System.out.printf("%.2f", quantity * 1.5);
                break;
            case "water":
                System.out.printf("%.2f", quantity * 1.0);
                break;
            case "coke":
                System.out.printf("%.2f", quantity * 1.4);
                break;
            case "snacks":
                System.out.printf("%.2f", quantity * 2.0);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String drink = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());

        calculatePrice(drink, quantity);
    }
}
