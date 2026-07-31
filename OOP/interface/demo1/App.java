public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();

        Predator dog = new Dog();
        dog.hunt();

        cat.eat();

        Predator catAsPredator = cat;
        Prey catAsPrey = cat;

        catAsPredator.hunt();
        catAsPrey.hide();
    }
}

