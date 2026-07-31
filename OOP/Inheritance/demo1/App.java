public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Milo", 2);
        Dog dog = new Dog("Rex", 3);

        cat.eat();
        dog.eat();
        dog.bark();
    }
}
