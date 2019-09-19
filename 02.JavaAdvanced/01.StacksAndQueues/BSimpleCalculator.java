import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class BSimpleCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> myStack = new ArrayDeque<>();
        String[] elements = reader.readLine().split("\\s+");

        for (int i = elements.length - 1; i >= 0; i--) {
            myStack.push(elements[i]);
        }

        while (myStack.size() > 1) {
            Integer firstNum = Integer.parseInt(myStack.pop());
            String op = myStack.pop();
            Integer secondNum = Integer.parseInt(myStack.pop());

            int sum = 0;
            if ("+".equalsIgnoreCase(op)) {
                sum = firstNum + secondNum;
            } else {
                sum = firstNum - secondNum;
            }

            myStack.push(String.valueOf(sum));
        }

        System.out.println(myStack.peek());
    }
}
