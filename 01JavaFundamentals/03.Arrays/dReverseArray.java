package com.company;

import java.util.Scanner;

public class dReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = sc.nextLine().split(" ");

        for (int i = 0; i < items.length / 2; i++) {
            String temp = items[i];
            items[i] = items[items.length - 1 - i];
            items[items.length - 1 - i] = temp;
        }

        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + " ");
        }
    }
}
