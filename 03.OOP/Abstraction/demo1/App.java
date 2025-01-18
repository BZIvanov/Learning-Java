public class App {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.eat();
        cat.sleep();
        dog.eat();
        dog.sleep();
    }
}
