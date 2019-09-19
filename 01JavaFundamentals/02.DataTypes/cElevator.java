package com.company;

import java.util.Scanner;

public class cElevator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int people = Integer.parseInt(sc.nextLine());
        int capacity = Integer.parseInt(sc.nextLine());

        int courses = (int) Math.ceil((double) people / capacity);
        System.out.println(courses);
    }
}
