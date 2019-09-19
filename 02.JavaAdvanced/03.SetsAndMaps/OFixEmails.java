import java.util.LinkedHashMap;
        import java.util.Map;
        import java.util.Scanner;

public class OFixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String name = sc.nextLine();
        while (!name.equalsIgnoreCase("stop")) {
            String email = sc.nextLine();

            if (!email.endsWith("us") && !email.endsWith("uk") && !email.endsWith("com")) {
                emails.putIfAbsent(name, email);
            }

            name = sc.nextLine();
        }

        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }
    }
}
