import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class JSetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> first = new LinkedHashSet<>();
        Set<Integer> second = new LinkedHashSet<>();

        int[] values = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < values[0]; i++) {
            int n = Integer.parseInt(sc.nextLine());
            first.add(n);
        }
        for (int i = 0; i < values[1]; i++) {
            int n = Integer.parseInt(sc.nextLine());
            second.add(n);
        }

        first.retainAll(second);

        first.forEach(e -> System.out.print(e + " "));
    }
}
