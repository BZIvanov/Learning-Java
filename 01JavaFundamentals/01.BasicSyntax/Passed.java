import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double grade = sc.nextDouble();

        if (grade >= 3.0) {
            System.out.println("Passed!");
        }
    }
}
