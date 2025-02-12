import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().toLowerCase();
        int age = Integer.parseInt(sc.nextLine());

        // to compare String types, we need to use equal method, because string is reference type not primitive type. If we use = sign to compare, we will compare the reference, not the value
        if (day.equals("weekday")) {
            if (age <= 18 && age >= 0) {
                System.out.println("12$");
            } else if (age <= 64 && age > 18) {
                System.out.println("18$");
            } else if (age <= 122 && age > 64) {
                System.out.println("12$");
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("weekend")) {
            if (age <= 18 && age >= 0) {
                System.out.println("15$");
            } else if (age <= 64 && age > 18) {
                System.out.println("20$");
            } else if (age <= 122 && age > 64) {
                System.out.println("15$");
            } else {
                System.out.println("Error!");
            }
        } else if (day.equals("holiday")) {
            if (age <= 18 && age >= 0) {
                System.out.println("5$");
            } else if (age <= 64 && age > 18) {
                System.out.println("12$");
            } else if (age <= 122 && age > 64) {
                System.out.println("10$");
            } else {
                System.out.println("Error!");
            }
        } else {
            System.out.println("Error!");
        }

        sc.close();
    }
}
