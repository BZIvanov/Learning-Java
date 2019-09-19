package com.company;

import java.util.Scanner;

public class bPrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int tempNum = Integer.parseInt(sc.nextLine());
            nums[i] = tempNum;
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
