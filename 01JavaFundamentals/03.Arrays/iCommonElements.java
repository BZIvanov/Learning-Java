package com.company;

import java.util.Scanner;

public class iCommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] first = sc.nextLine().split("\\s+");
        String[] second = sc.nextLine().split("\\s+");

        for (int i = 0; i < second.length; i++) {
            for (int j = 0; j < first.length; j++) {
                if (second[i].equals(first[j])) {
                    System.out.print(second[i] + " ");
                }
            }
        }
    }
}
