package company;

import java.util.Scanner;

public class vPadawanEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double budget = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightsabrePrice = Double.parseDouble(sc.nextLine());
        double robesPrice = Double.parseDouble(sc.nextLine());
        double beltsPrice = Double.parseDouble(sc.nextLine());

        double sabersPrice = Math.ceil(students * 1.1) * lightsabrePrice;
        robesPrice *= students;
        beltsPrice *= (students - students / 6);

        double totalCost = sabersPrice + robesPrice + beltsPrice;

        if (budget >= totalCost) {
            System.out.println(String.format("The money is enough - it would cost %.2flv.", totalCost));
        } else {
            System.out.println(String.format("Ivan Cho will need %.2flv more.", totalCost - budget));
        }
    }
}
