package com.company;

import java.util.Scanner;

public class pLowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = sc.nextLine();

        if(letter.charAt(0) >= 65 && letter.charAt(0) <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
