import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] first = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] second = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            }
            sum += first[i];
            if (i == first.length - 1) {
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }
        }
    }
}
