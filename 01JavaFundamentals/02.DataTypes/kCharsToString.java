package com.company;

import java.util.Scanner;

public class kCharsToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();
        data += sc.nextLine();
        data += sc.nextLine();

        System.out.println(data);
    }
}
