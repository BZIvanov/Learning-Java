import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DMatchingBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String expression = reader.readLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char openBracket = expression.charAt(i);

            if ('(' == openBracket) {
                stack.push(i);
            } else if (')' == openBracket) {
                System.out.println(expression.substring(stack.pop(), i + 1));
            }
        }
    }
}
