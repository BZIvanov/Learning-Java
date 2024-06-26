import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.stream(reader.readLine().split(", "))
                .toList();

        Pattern namePattern = Pattern.compile("[A-Za-z]");
        Pattern scorePattern = Pattern.compile("[0-9]");

        LinkedHashMap<String, Integer> finals = new LinkedHashMap<>();

        String raw = "";

        while (!"end of race".equals(raw = reader.readLine())) {
            String currentName = extractName(raw, namePattern);
            int currentScore = extractScore(raw, scorePattern);

            if (names.contains(currentName)) {
                if (!finals.containsKey(currentName)) {
                    finals.put(currentName, 0);
                }
                finals.put(currentName, finals.get(currentName) + currentScore);
            }
        }

        LinkedList<String> finalList = new LinkedList<>();
        finals.entrySet().stream().sorted((e1, e2) -> {
            return Integer.compare(e2.getValue(), e1.getValue());
        }).limit(3).forEach(e -> {
            finalList.add(e.getKey());
        });

        System.out.printf("1st place: %s%n2nd place: %s%n3rd place: %s%n",
                finalList.get(0), finalList.get(1), finalList.get(2));
    }

    private static String extractName(String raw, Pattern patt) {
        Matcher m = patt.matcher(raw);

        StringBuilder name = new StringBuilder();
        while (m.find()) {
            name.append(m.group());
        }

        return name.toString();
    }

    private static Integer extractScore(String raw, Pattern patt) {
        Matcher m = patt.matcher(raw);

        int score = 0;
        while (m.find()) {
            score += Integer.parseInt(m.group());
        }

        return score;
    }
}
