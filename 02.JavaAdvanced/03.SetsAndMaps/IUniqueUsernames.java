import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class IUniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> usernames = new LinkedHashSet<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String name = sc.nextLine();
            usernames.add(name);
        }

        for (String username : usernames) {
            System.out.println(username);
        }
    }
}
