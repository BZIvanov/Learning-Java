import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int snowballsCount = Integer.parseInt(sc.nextLine());

        double maxValue = 0;
        int maxSnow = 0, maxTime = 0, maxQuality = 0;

        for (int i = 0; i < snowballsCount; i++) {
            int snow = Integer.parseInt(sc.nextLine());
            int time = Integer.parseInt(sc.nextLine());
            int quality = Integer.parseInt(sc.nextLine());

            double value = Math.pow((double) snow / time, quality);

            if (maxValue < value) {
                maxValue = value;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)%n", maxSnow, maxTime, maxValue, maxQuality);
    }
}
