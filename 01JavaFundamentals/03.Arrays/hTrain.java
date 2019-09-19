package com.company;

import java.util.Scanner;

public class hTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wagon = Integer.parseInt(sc.nextLine());

        int[] passengers = new int[wagon];
        int sum = 0;

        for (int i = 0; i < wagon; i++) {
            passengers[i] = Integer.parseInt(sc.nextLine());
            sum += passengers[i];
        }

        for (int i = 0; i < passengers.length; i++) {
            System.out.print(passengers[i] + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
