import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightsabrePrice = Double.parseDouble(sc.nextLine());
        double robesPrice = Double.parseDouble(sc.nextLine());
        double beltsPrice = Double.parseDouble(sc.nextLine());

        double sabersPrice = Math.ceil(students * 1.1) * lightsabrePrice;
        robesPrice *= students;
        beltsPrice *= (students - (double) students / 6);

        double totalCost = sabersPrice + robesPrice + beltsPrice;

        if (budget >= totalCost) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.%n", totalCost - budget);
        }
    }
}
