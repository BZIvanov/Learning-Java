import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");

        Map<Double, Integer> result = new LinkedHashMap<>();
        for (String n : input) {
            double current = Double.parseDouble(n);
            if (!result.containsKey(current)) {
                result.put(current, 0);
            }
            result.put(current, result.get(current) + 1);
        }

        for (Map.Entry<Double, Integer> kvp : result.entrySet()) {
            System.out.printf("%.1f -> %d%n", kvp.getKey(), kvp.getValue());
        }

        sc.close();
    }
}
