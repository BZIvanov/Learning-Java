package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mCardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> first = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> second = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        while (first.size() > 0 && second.size() > 0) {
            int cardA = first.get(0);
            int cardB = second.get(0);

            if (cardA > cardB) {
                first.add(cardA);
                first.add(cardB);
                first.remove(0);
                second.remove(0);
            } else if (cardA < cardB) {
                second.add(cardA);
                second.add(cardB);
                first.remove(0);
                second.remove(0);
            } else {
                first.remove(0);
                second.remove(0);
            }

            System.out.println(first.toString());
            System.out.println(second.toString());
            System.out.println();
        }

        if (first.size() > 0) {
            int sum = first.stream().reduce((a, b) -> a + b).get();
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (second.size() > 0) {
            int sum = second.stream().reduce((a, b) -> a + b).get();
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }
}
