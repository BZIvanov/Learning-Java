package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class lTopIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        for (int i = 0; i < numbers.length; i++) {
            int currentNum = numbers[i];
            boolean isMax = true;
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNum <= numbers[j]) {
                    isMax = false;
                }
            }
            if (isMax) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
