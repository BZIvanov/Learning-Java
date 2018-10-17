package company;

import java.util.Scanner;

public class tVendingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double money = 0;
        while (true) {
            String input = sc.nextLine();

            if(input.equals("Start")) {
                break;
            } else {
                double coin = Double.parseDouble(input);

                if(coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                    money += coin;
                } else {
                    System.out.printf("Cannot accept %.2f%n", coin);
                }
            }
        }

        while (true) {
            String product = sc.nextLine();

            if (product.equals("End")) {
                break;
            }

            Boolean hasProduct = true;
            switch (product) {
                case "Nuts":
                    if (money >= 2) {
                        System.out.printf("Purchased Nuts%n");
                        money -= 2;
                        hasProduct = false;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                        hasProduct = false;
                    }
                break;
                case "Water":
                    if (money >= 0.7) {
                        System.out.printf("Purchased Water%n");
                        money -= 0.7;
                        hasProduct = false;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                        hasProduct = false;
                    }
                break;
                case "Crisps":
                    if (money >= 1.5) {
                        System.out.printf("Purchased Crisps%n");
                        money -= 1.5;
                        hasProduct = false;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                        hasProduct = false;
                    }
                break;
                case "Soda":
                    if (money >= 0.8) {
                        System.out.printf("Purchased Soda%n");
                        money -= 0.8;
                        hasProduct = false;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                        hasProduct = false;
                    }
                break;
                case "Coke":
                    if (money >= 1) {
                        System.out.printf("Purchased Coke%n");
                        money -= 1;
                        hasProduct = false;
                    } else {
                        System.out.printf("Sorry, not enough money%n");
                        hasProduct = false;
                    }
                break;
            }
            if (hasProduct) {
                System.out.printf("Invalid product%n");
            }
        }
        System.out.printf("Change: %.2f%n", money);
    }
}
