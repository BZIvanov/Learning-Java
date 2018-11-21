package company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class hTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> wagons =  Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(sc.nextLine());

        String line = sc.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split(" ");
            if (tokens[0].equals("Add")) {
                int newWagon = Integer.parseInt(tokens[1]);
                wagons.add(newWagon);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                wagons.stream().filter(w -> maxCapacity - w >= passengers)
                        .findFirst()
                        .ifPresent(freeWagon ->  {
                            int indexOfFreeWagon = wagons.indexOf(freeWagon);
                            wagons.set(indexOfFreeWagon, freeWagon + passengers);
                        });
            }
            line = sc.nextLine();
        }

        wagons.forEach(w -> System.out.print(w + " "));
    }
}
