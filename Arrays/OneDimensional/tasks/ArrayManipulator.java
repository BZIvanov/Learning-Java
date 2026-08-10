import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = parseNumbers(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] arguments = command.trim().split("\\s+");
            String operation = arguments[0];

            if (operation.equals("exchange")) {
                int index = Integer.parseInt(arguments[1]);
                if (index < 0 || index >= numbers.length) {
                    System.out.println("Invalid index");
                } else {
                    exchange(numbers, index);
                }
            } else if (operation.equals("max") || operation.equals("min")) {
                boolean even = arguments[1].equals("even");
                int index = findExtremeIndex(numbers, even, operation.equals("max"));
                System.out.println(index == -1 ? "No matches" : index);
            } else if (operation.equals("first") || operation.equals("last")) {
                int count = Integer.parseInt(arguments[1]);
                boolean even = arguments[2].equals("even");

                if (count < 0 || count > numbers.length) {
                    System.out.println("Invalid count");
                } else {
                    int[] matches = findMatches(numbers, count, even, operation.equals("first"));
                    System.out.println(Arrays.toString(matches));
                }
            }

            command = scanner.nextLine();
        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }

    private static int[] parseNumbers(String line) {
        return Arrays.stream(line.trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void exchange(int[] numbers, int index) {
        int[] copy = Arrays.copyOf(numbers, numbers.length);
        int firstPartLength = index + 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = copy[(i + firstPartLength) % numbers.length];
        }
    }

    private static int findExtremeIndex(int[] numbers, boolean even, boolean maximum) {
        int bestIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2 == 0) != even) {
                continue;
            }

            if (bestIndex == -1
                    || maximum && numbers[i] >= numbers[bestIndex]
                    || !maximum && numbers[i] <= numbers[bestIndex]) {
                bestIndex = i;
            }
        }

        return bestIndex;
    }

    private static int[] findMatches(int[] numbers, int count, boolean even, boolean fromStart) {
        int[] matches = new int[Math.min(count, numbers.length)];
        int found = 0;

        if (fromStart) {
            for (int number : numbers) {
                if ((number % 2 == 0) == even && found < count) {
                    matches[found++] = number;
                }
            }
        } else {
            for (int i = numbers.length - 1; i >= 0 && found < count; i--) {
                if ((numbers[i] % 2 == 0) == even) {
                    matches[found++] = numbers[i];
                }
            }
            reverse(matches, found);
        }

        return Arrays.copyOf(matches, found);
    }

    private static void reverse(int[] numbers, int length) {
        for (int left = 0, right = length - 1; left < right; left++, right--) {
            int temporary = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temporary;
        }
    }
}
