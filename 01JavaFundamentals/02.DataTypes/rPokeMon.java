package com.company;

import java.util.Scanner;

public class rPokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int beginPower = Integer.parseInt(sc.nextLine());
        int distance = Integer.parseInt(sc.nextLine());
        int factor = Integer.parseInt(sc.nextLine());

        int power = beginPower;

        int pokeCounter = 0;
        while (power >= distance) {

            pokeCounter++;
            power -= distance;

            if (power == beginPower / 2.0 && factor != 0) {
                power /= factor;
            }
        }

        System.out.println(power);
        System.out.println(pokeCounter);
    }
}
