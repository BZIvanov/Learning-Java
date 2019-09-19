import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class BSoftuniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> vipGuests = new TreeSet<>();
        Set<String> regularGuests = new TreeSet<>();

        String input = sc.nextLine();
        while (!"PARTY".equals(input)) {
            if (input.length() == 8) {
                if (Character.isDigit(input.charAt(0))) {
                    vipGuests.add(input);
                } else {
                    regularGuests.add(input);
                }
            }
            input = sc.nextLine();
        }

        while (!"END".equals(input)) {
            if (Character.isDigit(input.charAt(0))) {
                vipGuests.remove(input);
            } else {
                regularGuests.remove(input);
            }

            input = sc.nextLine();
        }

        System.out.println(vipGuests.size() + regularGuests.size());
        vipGuests.forEach(System.out::println);
        regularGuests.forEach(System.out::println);
    }
}
