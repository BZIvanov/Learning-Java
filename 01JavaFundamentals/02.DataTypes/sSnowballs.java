package com.company;

import java.util.Scanner;

public class sSnowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(sc.nextLine());

        double maxValue = 0;
        int maxSnow = 0, maxTime = 0, maxQuality = 0;

        for (int i = 0; i < snowballsCount; i++) {
            int snow = Integer.parseInt(sc.nextLine());
            int time = Integer.parseInt(sc.nextLine());
            int quality = Integer.parseInt(sc.nextLine());

            double value = Math.pow(snow / time, quality);

            if (maxValue < value) {
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }

        System.out.println(String.format("%d : %d = %.0f (%d)", maxSnow, maxTime, maxValue, maxQuality));
    }
}
