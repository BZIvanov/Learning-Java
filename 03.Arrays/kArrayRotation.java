package com.company;

import java.util.Scanner;

public class kArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strNumbers = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());
        rotations %= strNumbers.length;

        for (int i = 0; i < rotations; i++) {
            String element = strNumbers[0];
            for (int j = 0; j < strNumbers.length - 1; j++) {
                strNumbers[j] = strNumbers[j + 1];
            }
            strNumbers[strNumbers.length - 1] = element;
        }

        for (String str : strNumbers) {
            System.out.print(str + " ");
        }
    }
}
