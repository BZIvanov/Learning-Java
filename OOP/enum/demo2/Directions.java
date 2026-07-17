public class Directions {
    public static void main(String[] args) {
        Direction direction = Direction.NORTH;
        System.out.println(direction.getName()); // North
        System.out.println(direction.left().getName()); // West
        System.out.println(direction.right().getName()); // East
    }
}
