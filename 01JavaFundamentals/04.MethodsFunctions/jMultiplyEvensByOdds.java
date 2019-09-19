package com.company;

import java.util.Scanner;

public class jMultiplyEvensByOdds {

    static int getSumOfEvenDigits(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit % 2 == 0) {
                result += digit;
            }
        }

        return  result;
    }

    static int getSumOfOddDigits(int n) {
        int result = 0;
        while (n > 0) {
            int digit = n % 10;
            n /= 10;
            if (digit % 2 != 0) {
                result += digit;
            }
        }

        return  result;
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumOfEvenDigits(n);
        int odsSum = getSumOfOddDigits(n);

        return evenSum * odsSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        if(n < 0) {
            n *= -1;
        }
        System.out.println(getMultipleOfEvensAndOdds(n));
    }
}
