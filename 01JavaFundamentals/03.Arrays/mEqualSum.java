package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class mEqualSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        boolean hasEqualSum = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                hasEqualSum = true;
                break;
            }
        }

        if (!hasEqualSum) {
            System.out.println("no");
        }
    }
}
