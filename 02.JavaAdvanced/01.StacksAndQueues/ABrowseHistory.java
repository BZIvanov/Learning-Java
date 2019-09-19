import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class ABrowseHistory {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayDeque<String> myStack = new ArrayDeque<>();

        String input = "";

        while (!"Home".equals(input = reader.readLine())) {
            if (!input.equals("back")) {
                myStack.push(input);
                System.out.println(input);
            } else {
                if (myStack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    myStack.pop();
                    System.out.println(myStack.peek());
                }
            }
        }
    }
}
