import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IMatchNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        Pattern patt = Pattern.compile("(^|(?<=\\s))-?\\d+(\\.\\d+)?($|(?=\\s))");
        Matcher numbers = patt.matcher(text);

        List<String> results = new LinkedList<>();

        while (numbers.find()) {
            results.add(numbers.group());
        }

        System.out.println(String.join(" ", results));
    }
}
