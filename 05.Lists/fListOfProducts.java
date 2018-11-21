package company;

import java.util.*;

public class fListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(sc.nextLine());
        }

        Collections.sort(products);
        // below is example of how to sort in descending order
        // Collections.sort(products, Collections.reverseOrder());

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + products.get(i - 1));
        }
    }
}
