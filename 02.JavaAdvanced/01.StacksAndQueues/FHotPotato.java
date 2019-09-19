import java.util.ArrayDeque;
import java.util.Scanner;

public class FHotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] children = sc.nextLine().split("\\s+");
        int n = Integer.valueOf(sc.nextLine());

        ArrayDeque<String> queue = new ArrayDeque<>();

        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
