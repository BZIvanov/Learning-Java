public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // This will throw ArrayIndexOutOfBoundsException

            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds. Please check your array indices!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred: Division by zero is not allowed!");
        } catch (Exception e) {
            // Generic catch block for any other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
        
        System.out.println("Program continues running after exception handling.");
    }
}
