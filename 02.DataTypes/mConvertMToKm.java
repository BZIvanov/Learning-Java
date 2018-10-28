package com.company;

import java.util.Scanner;

public class mConvertMToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int meters = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f", meters / 1000.0);
    }
}
