package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class oMagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int target = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (sum == target) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
