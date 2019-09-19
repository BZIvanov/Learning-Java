import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ELargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(Collections.reverseOrder())
                .limit(3)
                .map(n -> String.valueOf(n))
                .collect(Collectors.joining(" ")));
    }
}
