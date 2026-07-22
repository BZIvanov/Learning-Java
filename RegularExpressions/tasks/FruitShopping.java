import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FruitShopping {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = ">>(?<item>[A-Za-z]+)<<(?<price>\\d+(\\.\\d+)?)!(?<quantity>\\d+)";
        Pattern patt = Pattern.compile(regex);

        List<String> fruits = new ArrayList<>();
        double totalAmount = 0.0;

        String input = "";
        while (!"Purchase".equals(input = reader.readLine())) {
            Matcher matcher = patt.matcher(input);

            if (matcher.find()) {
                fruits.add(matcher.group("item"));
                double sum = Double.parseDouble(matcher.group("price")) * Double.parseDouble(matcher.group("quantity"));
                totalAmount += sum;
            }
        }

        System.out.println("Bought fruits:");
        for (String f : fruits) {
            System.out.println(f);
        }
        System.out.printf("Total money spend: %.2f%n", totalAmount);
    }
}
