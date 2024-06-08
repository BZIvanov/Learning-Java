import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // grade is property of our class
        double grade = Double.parseDouble(sc.nextLine());

        if (grade >= 3.0) {
            System.out.println("Passed!");
        }
    }
}
