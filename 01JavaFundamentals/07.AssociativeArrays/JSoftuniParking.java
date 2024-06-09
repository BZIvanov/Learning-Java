import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class SoftuniParking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> users = new LinkedHashMap<>();
        int n = Integer.parseInt(reader.readLine());

        while (n-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            switch (command) {
                case "register":
                    String regNumber = tokens[2];
                    if (users.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", users.get(name));
                    } else {
                        users.put(name, regNumber);
                        System.out.printf("%s registered %s successfully%n", name, regNumber);
                    }
                    break;
                case "unregister":
                    if (users.containsKey(name)) {
                        users.remove(name);
                        System.out.printf("%s unregistered successfully%n", name);
                    } else {
                        System.out.printf("ERROR: user %s not found%n", name);
                    }
                    break;
            }
        }

        for (Map.Entry<String, String> entry : users.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }
    }
}
