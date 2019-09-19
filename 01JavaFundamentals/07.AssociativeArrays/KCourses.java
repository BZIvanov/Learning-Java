import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class KCourses {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String line = "";

        while (!"end".equals(line = reader.readLine())) {
            String[] tokens = line.split(" : ");
            String course = tokens[0];
            String name = tokens[1];

            if (!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
            }
            courses.get(course).add(name);
        }

        courses.entrySet().stream()
                .sorted((c1,c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(i -> {
                    System.out.printf("%s: %d%n",i.getKey(),i.getValue().size());

                    i.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(n -> System.out.println(String.format("-- %s", n)));
                });
    }
}
