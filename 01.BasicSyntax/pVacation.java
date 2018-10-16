package com.company;

import java.util.Scanner;

public class pVacation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String group = sc.nextLine();
        String day = sc.nextLine();

        double totalPrice = 0;
        if(group.equals("Students")) {
            if (day.equals("Friday")) {
                totalPrice = 8.45 * n;
            } else if (day.equals("Saturday")) {
                totalPrice = 9.8 * n;
            } else if (day.equals("Sunday")) {
                totalPrice = 10.46 * n;
            }

            if (n >= 30) {
                totalPrice *= 0.85;
            }
        } else if (group.equals("Business")) {
            double temp = 0;
            if (day.equals("Friday")) {
                totalPrice = 10.9 * n;
                temp = 10.9;
            } else if (day.equals("Saturday")) {
                totalPrice = 15.6 * n;
                temp = 15.6;
            } else if (day.equals("Sunday")) {
                totalPrice = 16 * n;
                temp = 16;
            }

            if (n >= 100) {
                totalPrice -= 10 * temp;
            }
        } else if (group.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = 15 * n;
            } else if (day.equals("Saturday")) {
                totalPrice = 20 * n;
            } else if (day.equals("Sunday")) {
                totalPrice = 22.5 * n;
            }

            if (n >= 10 && n <= 20) {
                totalPrice *= 0.95;
            }
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
