public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        // Demonstrating inherited behavior
        cat.eat(); // Output: "Animal eating"
        dog.eat(); // Output: "Animal eating"

        // Demonstrating unique behavior in Dog
        dog.bark(); // Output: "Dog barking"
    }
}
