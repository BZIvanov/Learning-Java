import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        String line = sc.nextLine();

        while (!line.equals("End")) {
            String[] tokens = line.split("\\s+");

            switch (tokens[0]) {
                case "Add" -> numbers.add(Integer.parseInt(tokens[1]));
                case "Insert" -> {
                    int index = Integer.parseInt(tokens[2]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.add(index, Integer.parseInt(tokens[1]));
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Remove" -> {
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < numbers.size()) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }
                }
                case "Shift" -> {
                    int count = Integer.parseInt(tokens[2]);
                    count %= numbers.size();

                    if (tokens[1].equals("left")) {
                        for (int i = 0; i < count; i++) {
                            numbers.add(numbers.getFirst());
                            numbers.removeFirst();
                        }
                    } else {
                        for (int i = 0; i < count; i++) {
                            numbers.addFirst(numbers.getLast());
                            numbers.removeLast();
                        }
                    }
                }
            }

            line = sc.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
