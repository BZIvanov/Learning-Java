import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            products.add(sc.nextLine());
        }

        Collections.sort(products);
        products.sort(Collections.reverseOrder());

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "." + products.get(i - 1));
        }
    }
}
