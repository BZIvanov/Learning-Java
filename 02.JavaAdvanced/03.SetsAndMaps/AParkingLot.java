import java.util.HashSet;
import java.util.Scanner;

public class AParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> parkingLot = new HashSet<>();
        String input;

        while (!"END".equals(input = sc.nextLine())) {
            String[] tokens = input.split(",\\s+");
            switch (tokens[0]) {
                case "IN":
                    parkingLot.add(tokens[1]);
                    break;
                case "OUT":
                    parkingLot.remove(tokens[1]);
                    break;
            }
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
            return;
        }

        for (String s : parkingLot) {
            System.out.println(s);
        }
    }
}
