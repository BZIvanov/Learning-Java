package com.company;

import java.util.Scanner;

public class qPrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        int sum = 0;
        String nums = "";
        for(int i = start; i <= end; i++) {
            sum += i;
            nums += i + " ";
        }
        System.out.println(nums.trim());
        System.out.printf("Sum: %d", sum);
    }
}
