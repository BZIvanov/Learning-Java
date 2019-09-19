import java.util.*;
import java.util.stream.Collectors;

public class HAcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Double>> school = new TreeMap<>();

        int count = Integer.parseInt(sc.nextLine());
        while (count-- != 0) {
            String name = sc.nextLine();
            List<Double> grades = Arrays.stream(sc.nextLine().split("\\s+"))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            school.putIfAbsent(name, new ArrayList<>());
            school.get(name).addAll(grades);
        }

        school.forEach((name, grades) -> {
            double sum = 0;
            for (Double grade : grades) {
                sum += grade;
            }
            double avg = sum / grades.size();
            System.out.println(String.format("%s is graduated with %s", name, avg));
        });
    }
}
