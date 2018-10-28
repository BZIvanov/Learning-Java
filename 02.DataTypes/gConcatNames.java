package com.company;

import java.util.Scanner;

public class gConcatNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String delimeter = sc.nextLine();

        System.out.printf("%s%s%s", firstName, delimeter, secondName);
    }
}
