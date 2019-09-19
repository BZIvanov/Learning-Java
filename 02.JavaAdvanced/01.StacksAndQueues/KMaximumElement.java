import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class KMaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "1":
                    int element = Integer.parseInt(tokens[1]);
                    numbers.push(element);
                    break;
                case "2":
                    numbers.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(numbers));
            }
        }
    }
}
