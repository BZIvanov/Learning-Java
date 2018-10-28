package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class bExactSumRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        BigDecimal result = new BigDecimal("0");
        for (int i = 0; i < n; i++) {
            BigDecimal num = sc.nextBigDecimal();
            result = result.add(num);
        }

        System.out.println(result);
    }
}
