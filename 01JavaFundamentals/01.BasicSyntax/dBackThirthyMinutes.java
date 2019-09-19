package com.company;

import java.util.Scanner;

public class dBackThirthyMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hours = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;

        if(h > 23) {
            h -= 24;
        }
        System.out.printf("%d:%02d",h , m);
    }
}
