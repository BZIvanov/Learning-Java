import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArray = sc.nextLine().split("\\s+");

        StringBuilder result = new StringBuilder();
        for (String el : inputArray) {
            int elLength = el.length();
            result.append(el.repeat(elLength));
        }

        System.out.println(result);

        sc.close();
    }
}
