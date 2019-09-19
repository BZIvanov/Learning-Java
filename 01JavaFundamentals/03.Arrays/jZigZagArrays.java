package com.company;

import java.util.Scanner;

public class jZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lines = Integer.parseInt(sc.nextLine());

        int[] first = new int[lines];
        int[] second = new int[lines];

        for (int i = 0; i < lines; i++) {
            String[] numbers = sc.nextLine().split(" ");

            if (i % 2 == 0) {
                first[i] = Integer.parseInt(numbers[0]);
                second[i] = Integer.parseInt(numbers[1]);
            } else {
                first[i] = Integer.parseInt(numbers[1]);
                second[i] = Integer.parseInt(numbers[0]);
            }
        }

        for (int n : first) {
            System.out.print(n + " ");
        }
        System.out.println();
        for (int n : second) {
            System.out.print(n + " ");
        }
    }
}
