import java.util.Scanner;

public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();

        if (grade >= 3.0) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }

        sc.close();
    }
}
