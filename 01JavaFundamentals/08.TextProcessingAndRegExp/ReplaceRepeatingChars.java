import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReplaceRepeatingChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String text = reader.readLine();

        StringBuilder result = new StringBuilder();

        char prev = text.charAt(0);
        result.append(prev);
        for (int i = 1; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (prev != symbol) {
                prev = symbol;
                result.append(prev);
            }
        }

        System.out.println(result);
    }
}
