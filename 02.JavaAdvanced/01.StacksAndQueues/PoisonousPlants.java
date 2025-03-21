import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class PoisonousPlants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] plants = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToLong(Long::parseLong)
                .toArray();

        int[] days = new int[plants.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for (int i = 1; i < plants.length; i++) {
            int maxDays = 0;

            while (!stack.isEmpty() && plants[stack.peek()] >= plants[i]) {
                maxDays = Math.max(maxDays, days[stack.pop()]);
            }
            if (!stack.isEmpty()) {
                days[i] = maxDays + 1;
            }
            stack.push(i);
        }

        System.out.println(Arrays.stream(days).max().getAsInt());

        sc.close();
    }
}
