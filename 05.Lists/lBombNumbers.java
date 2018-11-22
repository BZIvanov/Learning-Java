package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lBombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        String[] tokens = sc.nextLine().split("\\s+");
        int bomb = Integer.parseInt(tokens[0]);
        int power = Integer.parseInt(tokens[1]);

        while (numbers.contains(bomb)) {
            int index = numbers.indexOf(bomb);

            int begin = index - power;
            begin = Math.max(0, begin);

            for (int i = begin; i < index; i++) {
                numbers.remove(begin);
            }
        }
    }
}
