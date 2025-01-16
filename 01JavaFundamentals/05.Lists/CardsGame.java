import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> first = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        ArrayList<Integer> second = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        while (!first.isEmpty() && !second.isEmpty()) {
            int cardA = first.getFirst();
            int cardB = second.getFirst();

            if (cardA > cardB) {
                first.add(cardA);
                first.add(cardB);
                first.removeFirst();
                second.removeFirst();
            } else if (cardA < cardB) {
                second.add(cardA);
                second.add(cardB);
                first.removeFirst();
                second.removeFirst();
            } else {
                first.removeFirst();
                second.removeFirst();
            }

            System.out.println(first.toString());
            System.out.println(second.toString());
            System.out.println();
        }

        if (!first.isEmpty()) {
            int sum = first.stream().reduce(Integer::sum).get();
            System.out.printf("First player wins! Sum: %d", sum);
        } else if (!second.isEmpty()) {
            int sum = second.stream().reduce(Integer::sum).get();
            System.out.printf("Second player wins! Sum: %d", sum);
        }

        sc.close();
    }
}
