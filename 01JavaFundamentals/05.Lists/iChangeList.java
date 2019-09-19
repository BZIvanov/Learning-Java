package company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class iChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ArrayList<Integer> is the same as List<Integer>
        ArrayList<Integer> numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayList::new));

        String line = sc.nextLine();

        while (!line.equals("end")) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            if (command.equals("Delete")) {
                int element = Integer.parseInt(tokens[1]);

                while (numbers.contains(element)) {
                    // here is important to use valueOf to call the method remove with Object parameter, because otherwise it will be called as it is index
                    numbers.remove(Integer.valueOf(element));
                }
            } else {
                int element = Integer.parseInt(tokens[1]);
                int index = Integer.parseInt(tokens[2]);
                if (index < numbers.size()) {
                    numbers.add(index, element);
                }
            }

            line = sc.nextLine();
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
