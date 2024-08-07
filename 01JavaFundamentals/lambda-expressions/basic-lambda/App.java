public class App {
    public static void main(String[] args) {
        Calculator c1 = (a, b) -> a + b;
        Calculator c2 = Integer::sum;
        Calculator c3 = (a, b) -> {
            System.out.println("Multiply");
            return a * b;
        };

        System.out.println(c1.calculate(2, 3));
        System.out.println(c2.calculate(2, 3));
        System.out.println(c3.calculate(2, 3));
    }
}