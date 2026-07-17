public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        
        animal.setName("Lion");
        animal.setAge(3);

        System.out.println("Name: " + animal.getName());
        System.out.println("Age: " + animal.getAge());
    }
}
