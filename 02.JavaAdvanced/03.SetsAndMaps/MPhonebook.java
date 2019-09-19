import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MPhonebook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> phonebook = new HashMap<>();

        String person;
        while (!"search".equals(person = sc.nextLine())) {
            String[] tokens = person.split("-");
            phonebook.put(tokens[0], tokens[1]);
        }

        String target;
        while (!"stop".equals(target = sc.nextLine())) {
            if (phonebook.containsKey(target)) {
                System.out.println(String.format("%s -> %s", target, phonebook.get(target)));
            } else {
                System.out.println(String.format("Contact %s does not exist.", target));
            }
        }
    }
}
