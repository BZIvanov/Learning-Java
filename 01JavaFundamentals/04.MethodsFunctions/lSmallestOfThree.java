package com.company;

import java.util.Scanner;

public class lSmallestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        int third = Integer.parseInt(sc.nextLine());

        printSmallest(first, second, third);
    }

    public static void printSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (a > b && b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
