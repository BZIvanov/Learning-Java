import java.util.*;
import java.util.stream.Collectors;

public class EAverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Double>> students = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            String name = tokens[0];
            double grade = Double.parseDouble(tokens[1]);
            if (!students.containsKey(name)) {
                students.put(name, new ArrayList<>());
            }
            students.get(name).add(grade);
        }

        students.forEach((k, v) -> {
            String allGrades = v.stream()
                    .map(g -> String.format("%.2f", g))
                    .collect(Collectors.joining(" "));
            double avg = v.stream().mapToDouble(e -> e).average().orElse(0d);
            System.out.println(String.format("%s -> %s (avg: %.2f)", k, allGrades, avg));
        });
    }
}
