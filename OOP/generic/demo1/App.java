public class App {
    public static void main(String[] args) {
        Box<Cake> cakeBox = new Box<>();

        Cake chocolateCake = new Cake();
        chocolateCake.setType("chocolate");

        cakeBox.setItem(chocolateCake);

        Box<Toy> toyBox = new Box<>();

        Toy bunnyToy = new Toy();
        bunnyToy.setName("Fluffy");

        toyBox.setItem(bunnyToy);

        Cake cake = cakeBox.getItem();
        Toy toy = toyBox.getItem();

        System.out.println("Cake type: " + cake.getType());
        System.out.println("Toy name: " + toy.getName());
    }
}
