import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyExample {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt(); // May throw InputMismatchException if input is not an integer
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a whole number.");
        } finally {
            // The finally block will execute no matter what happens in try/catch
            if (scanner != null) {
                scanner.close(); // Close the scanner to prevent resource leaks
            }

            System.out.println("Scanner closed.");
        }

        System.out.println("Program continues running after try-catch-finally.");
    }
}
