import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int centuries = Integer.parseInt(sc.nextLine());
        int years = centuries * 100;
        // below we cast the value to int
        int days = (int) (years * 365.2422);
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes", centuries, years, days, hours, minutes);

        sc.close();
    }
}
