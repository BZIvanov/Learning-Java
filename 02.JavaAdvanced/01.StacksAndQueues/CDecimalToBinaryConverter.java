import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class CDecimalToBinaryConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int decimal = Integer.valueOf(reader.readLine());
        ArrayDeque<Integer> myStack = new ArrayDeque<>();

        if (decimal == 0) {
            System.out.println(0);
            return;
        }

        while (decimal != 0) {
            myStack.push(decimal % 2);
            decimal /= 2;
        }

        while (!myStack.isEmpty()) {
            System.out.print(myStack.pop());
        }
    }
}
