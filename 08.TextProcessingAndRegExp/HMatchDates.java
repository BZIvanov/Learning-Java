import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HMatchDates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String dates = sc.nextLine();

        Pattern patt = Pattern.compile("\\b(?<day>\\d{2})(\\.|\\/|-)(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b");
        Matcher mat = patt.matcher(dates);

        while (mat.find()) {
            System.out.println(String.format("Day: %s, Month: %s, Year: %s",
                    mat.group("day"), mat.group("month"), mat.group("year")));
        }
    }
}
