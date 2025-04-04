import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+")).forEach(stack::push);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        sc.close();
    }
}
