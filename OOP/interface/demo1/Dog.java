public class Dog extends Animal implements Predator {
    @Override
    void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void hunt() {
        System.out.println("Dog hunting");
    }
}
