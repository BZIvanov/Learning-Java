import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BarIncome {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String regex = "%(?<customer>[A-Z][a-z]+)%[^|$%.]*<(?<product>[^<>]+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>[-+]?\\d+\\.?\\d+)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = "";
        double totalIncome = 0.0;
        while (!"end of shift".equals(input = reader.readLine())) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);

                totalIncome += (count * price);
            }
        }

        System.out.printf("Total income: %.2f%n", totalIncome);
    }
}
