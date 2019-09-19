import java.util.ArrayDeque;
import java.util.Scanner;

public class PSimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayDeque<StringBuilder> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");

            switch (tokens[0]) {
                case "1":
                    text.append(tokens[1]);
                    stack.push(new StringBuilder(text));
                    break;
                case "2":
                    int count = Integer.parseInt(tokens[1]);
                    int start = text.length() - count;
                    text.delete(start, start + count);
                    stack.push(new StringBuilder(text));
                    break;
                case "3":
                    int index = Integer.parseInt(tokens[1]);
                    System.out.println(text.charAt(index - 1));
                    break;
                case "4":
                    if (stack.size() > 1) {
                        stack.pop();
                        text = stack.peek();
                    } else if (stack.size() == 1) {
                        text = new StringBuilder();
                    }
                    break;
            }
        }
    }
}
