import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Map<String, Double>> shop = new TreeMap<>();

        String input;
        while (!"Revision".equals(input = sc.nextLine())) {
            String[] tokens = input.split(", ");
            String shopName = tokens[0];
            String productName = tokens[1];
            Double productPrice = Double.parseDouble(tokens[2]);

            shop.putIfAbsent(shopName, new LinkedHashMap<>());
            shop.get(shopName).putIfAbsent(productName, productPrice);
        }

        shop.forEach((shopName, products) -> {
            System.out.println(shopName + "->");
            products.forEach((productName, productPrice) -> {
                System.out.printf("Product: %s, Price: %.1f%n", productName, productPrice);
            });
        });

        sc.close();
    }
}
