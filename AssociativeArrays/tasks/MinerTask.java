import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class MinerTask {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> resources = new LinkedHashMap<>();

        String input = "";

        while (!"stop".equals(input = reader.readLine())) {
            int quantity = Integer.parseInt(reader.readLine());

            if (!resources.containsKey(input)) {
                resources.put(input, quantity);
            } else {
                resources.put(input, resources.get(input) + quantity);
            }
        }

        resources.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }
}
