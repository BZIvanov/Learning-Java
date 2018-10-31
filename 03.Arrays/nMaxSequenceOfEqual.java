package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class nMaxSequenceOfEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int maxLength = 1;
        int counter = 1;
        int bestIndex = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                counter++;
            } else {
                counter = 1;
            }

            if (counter > maxLength) {
                maxLength = counter;
                bestIndex = i + 1;
            }
        }

        for (int i = 0; i < maxLength; i++) {
            System.out.print(numbers[bestIndex] + " ");
        }
    }
}
