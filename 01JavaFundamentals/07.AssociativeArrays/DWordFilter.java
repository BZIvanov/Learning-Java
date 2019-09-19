import java.util.Arrays;
import java.util.Scanner;

public class DWordFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Arrays.stream(sc.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .forEach(System.out::println);
    }
}
