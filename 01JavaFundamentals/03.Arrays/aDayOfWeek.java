package com.company;

import java.util.Scanner;

public class aDayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        int target = Integer.parseInt(sc.nextLine());

        if (target >= 1 && target <= 7) {
            System.out.println(days[target - 1]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}
