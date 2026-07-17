abstract class Animal {
    // Abstract method (does not have a body)
    abstract void eat();

    // all animals would inherit the sleep() method, while providing their own eat() implementation.
    void sleep() {
        System.out.println("Animal sleeping");
    }
}
