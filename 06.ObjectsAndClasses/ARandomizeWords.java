package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ARandomizeWords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        List<String> words = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        while (!words.isEmpty()) {
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(words.size());

            String word = words.get(randomIndex);
            System.out.println(word);
            words.remove(randomIndex);
        }
    }
}
