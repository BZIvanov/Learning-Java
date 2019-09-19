import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MCompanyUsers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Set<String>> companies = new TreeMap<>();
        String line = "";

        while (!"End".equals(line = reader.readLine())) {
            String[] tokens = line.split(" -> ");
            String name = tokens[0];
            String id = tokens[1];

            if (!companies.containsKey(name)) {
                companies.put(name, new LinkedHashSet<>());
            }
            companies.get(name).add(id);
        }

        companies.entrySet().stream().forEach(e -> {
                    System.out.println(e.getKey());

                    e.getValue().stream().forEach(a -> System.out.println(String.format("-- %s",a)));
                });
    }
}
