import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class CitiesByContinetAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> towns = new LinkedHashMap<>();

        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] tokens = sc.nextLine().split("\\s+");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            if (!towns.containsKey(continent)) {
                towns.put(continent, new LinkedHashMap<>());
            }
            if (!towns.get(continent).containsKey(country)) {
                towns.get(continent).put(country, new ArrayList<>());
            }
            towns.get(continent).get(country).add(city);
        }

        towns.forEach((key, value) -> {
            System.out.printf("%s:%n", key);
            value.forEach((innerKey, innerValue) -> {
                String cities = String.join(", ", innerValue);
                System.out.printf("  %s -> %s%n", innerKey, cities);
            });
        });

        sc.close();
    }
}
