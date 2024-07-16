import java.util.Random;
import java.util.HashSet;
import java.util.Scanner;

public class BirthdayParadox {
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int trials = Integer.parseInt(sc.nextLine());

        // Array to keep track of the number of people entering the room for each trial
        int[] counts = new int[n + 1];

        // Perform the experiment trials times
        Random rand = new Random();
        for (int t = 0; t < trials; t++) {
            HashSet<Integer> birthdays = new HashSet<>();
            int people = 0;
            while (true) {
                int birthday = rand.nextInt(n);
                people++;
                if (birthdays.contains(birthday)) {
                    counts[people]++;
                    break;
                }
                birthdays.add(birthday);
            }
        }

        // Print the results
        System.out.println("i\tCount\tFraction");
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += counts[i];
            double fraction = (double) total / trials;
            System.out.printf("%d\t%d\t%.6f\n", i, counts[i], fraction);
            if (fraction >= 0.50) break;
        }
    }
}
