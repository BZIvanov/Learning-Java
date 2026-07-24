public class StaticBlockExample {
    // Static variable
    static int value;

    // Static block - runs when the class is loaded
    static {
        System.out.println("Static block executed.");
        value = 42; // Initializing static variable
    }

    // Constructor
    public StaticBlockExample() {
        System.out.println("Constructor executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method started.");
        System.out.println("Value: " + value); // Accessing static variable

        // Creating an instance of the class
        StaticBlockExample example = new StaticBlockExample();
    }
}
