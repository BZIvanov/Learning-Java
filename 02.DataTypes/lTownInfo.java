package com.company;

import java.util.Scanner;

public class lTownInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String town = sc.nextLine();
        String population = sc.nextLine();
        String area = sc.nextLine();

        System.out.printf("Town %s has population of %s and area %s square km.", town, population, area);
    }
}
