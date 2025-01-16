import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double first = Double.parseDouble(sc.nextLine());
        double second = Double.parseDouble(sc.nextLine());

        double divisionResult = fact(first) / fact(second);
        System.out.printf("%.2f%n", divisionResult);

        sc.close();
    }

    public static double fact(double num) {
        if (num < 1) {
            return 1;
        }

        return num * fact(num - 1);
    }
}
