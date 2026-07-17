public class App {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        if (today == Day.SUNDAY) {
            System.out.println("Time to relax");
        } else {
            System.out.println("Time to work");
        }
    }
}
