public class Cat extends Animal implements Predator, Prey {
    @Override
    void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void hunt() {
        System.out.println("Cat hunting");
    }

    @Override
    public void hide() {
        System.out.println("Cat hiding");
    }
}
