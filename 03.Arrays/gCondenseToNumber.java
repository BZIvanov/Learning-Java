package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class gCondenseToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int result = 0;

        if (numbers.length == 1) {
            result = numbers[0];
        }

        while (numbers.length > 1) {

            int[] condensed = new int[numbers.length - 1];

            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }

            numbers = condensed;
            result = condensed[0];
        }

        System.out.println(result);
    }
}
