import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class ForceBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Set<String>> forceBook = new LinkedHashMap<>();

        String input = "";
        while (!"End".equals(input = reader.readLine())) {
            String[] data = Arrays.stream(input.split("\\s+\\|\\s+|\\s+->\\s+")).toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                if (forceBook.entrySet().stream().noneMatch(e -> e.getValue().contains(forceUser))) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = data[0];
                String forceSide = data[1];

                forceBook.forEach((_, value) -> {
                    value.remove(forceUser);
                });

                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
        }

        forceBook.entrySet().stream()
                .filter(e -> !e.getValue().isEmpty())
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());

                    e.getValue().forEach(u -> {
                        System.out.printf("! %s%n", u);
                    });
                });
    }
}
