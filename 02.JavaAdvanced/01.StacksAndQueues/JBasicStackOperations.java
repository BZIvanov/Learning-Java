import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class JBasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] parameters = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int itemsToPush = parameters[0];
        int itemsToPop = parameters[1];
        int itemToCheck = parameters[2];

        Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(itemsToPush)
                .forEach(stack::push);

        for (int i = 0; i < itemsToPop; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            if (stack.contains(itemToCheck)) {
                System.out.println(true);
            } else {
                int min = Integer.MAX_VALUE;
                while (!stack.isEmpty()) {
                    int current = stack.pop();
                    if (min > current) {
                        min = current;
                    }
                }
                System.out.println(min);
            }
        }
    }
}
