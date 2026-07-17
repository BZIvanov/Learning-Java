class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an anonymous class extending Animal
        // Anonymous class is a class without a name, e.g new Animal() { ... }
        Animal dog = new Animal() {
            @Override
            void makeSound() {
                System.out.println("Dog barks: Woof Woof!");
            }
        };

        dog.makeSound();
    }
}
