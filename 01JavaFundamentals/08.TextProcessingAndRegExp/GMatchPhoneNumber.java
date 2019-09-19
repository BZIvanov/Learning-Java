import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GMatchPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // \1 in the regex allows us to reuse another group. It means use the group 1 again so it will not be necessary to rewrite it again. This is known as "backreference"
        String regex = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        String phones = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Matcher phoneMatcher = pattern.matcher(phones);

        List<String> matchedPhones = new LinkedList<>();

        while (phoneMatcher.find()) {
            matchedPhones.add(phoneMatcher.group());
        }

        System.out.println(String.join(", ", matchedPhones));
    }
}
