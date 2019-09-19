import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LBasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] orders = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .limit(orders[0])
                .forEach(queue::add);

        int itemsToPoll = orders[1];
        while (itemsToPoll-- > 0) {
            queue.poll();
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            if (queue.contains(orders[2])) {
                System.out.println(true);
            } else {
                System.out.println(Collections.min(queue));
            }
        }
    }
}
