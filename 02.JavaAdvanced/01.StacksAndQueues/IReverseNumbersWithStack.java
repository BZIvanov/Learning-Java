import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class IReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        Arrays.stream(sc.nextLine().split("\\s+")).forEach(e -> stack.push(e));

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
