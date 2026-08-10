import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] first = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] second = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int sharedLength = Math.min(first.length, second.length);
        boolean identical = first.length == second.length;

        for (int i = 0; i < sharedLength; i++) {
            if (first[i] != second[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                identical = false;
                sc.close();
                return;
            }
            sum += first[i];
        }

        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", sharedLength);
        }

        sc.close();
    }
}
