import java.util.Scanner;

public class SafeDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter second number: ");
        int secondNumber = Integer.parseInt(scanner.nextLine());

        try {
            int result = firstNumber / secondNumber;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}
