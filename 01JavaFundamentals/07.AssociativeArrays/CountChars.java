import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class CountChars {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<Character, Integer> countChars = new LinkedHashMap<>();

        String text = String.join("", reader.readLine().split("\\s+"));

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (!countChars.containsKey(symbol)) {
                countChars.put(symbol, 0);
            }
            countChars.put(symbol, countChars.get(symbol) + 1);
        }

        countChars.forEach((key, value) -> System.out.printf("%c -> %d%n", key, value));
    }
}
