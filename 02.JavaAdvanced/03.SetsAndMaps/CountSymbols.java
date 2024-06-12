import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Character, Integer> table = new TreeMap<>();

        String text = sc.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);

            if (!table.containsKey(symbol)) {
                table.put(symbol, 0);
            }
            table.put(symbol, table.get(symbol) + 1);
        }

        for (Character ch : table.keySet()) {
            System.out.printf("%c: %d time/s%n", ch, table.get(ch));
        }
    }
}
