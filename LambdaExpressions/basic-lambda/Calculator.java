@FunctionalInterface
public interface Calculator {
    int calculate(int a, int b);

    default void print() {
        System.out.println("Print some text");
    }
}
