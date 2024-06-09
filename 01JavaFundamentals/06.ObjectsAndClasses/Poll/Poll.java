import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OpinionPoll {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());
        List<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = reader.readLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people
                .stream()
                .filter(e -> e.age() > 30)
                .sorted((p1, p2) -> Integer.compare(p1.age(), p2.age()))
                .sorted(Comparator.comparing(Person::name))
                .forEach(e -> System.out.println(e.toString()));
    }
}
