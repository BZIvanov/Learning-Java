import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class IOpinionPoll {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<IPerson> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            IPerson person = new IPerson(name, age);
            people.add(person);
        }

        people
                .stream()
                .filter(e -> e.getAge() > 30)
                .sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .sorted(Comparator.comparing(IPerson::getName))
                .forEach(e -> System.out.println(e.toString()));
    }
}
