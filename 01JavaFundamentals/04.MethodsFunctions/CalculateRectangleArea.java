import java.util.Scanner;

public class CalculateRectangleArea {
    static double calculateArea(double sideA, double sideB) {
        return sideA * sideB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());

        System.out.printf("%.2f", calculateArea(a, b));

        sc.close();
    }
}
