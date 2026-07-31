public class App {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 3);
        animal.setAge(4);

        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
    }
}
