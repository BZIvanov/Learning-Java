import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        try {
            validateAge(age);
            System.out.println("Age accepted: " + age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }

        if (age > 120) {
            throw new IllegalArgumentException("Age is too high.");
        }
    }
}
