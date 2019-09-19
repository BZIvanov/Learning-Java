import java.util.Scanner;

public class ARepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArray = sc.nextLine().split("\\s+");

        String result = "";
        for (int i = 0; i < inputArray.length; i++) {
            String el = inputArray[i];
            int elLength = el.length();
            for (int j = 0; j < elLength; j++) {
                result += el;
            }
        }

        System.out.println(result);
    }
}
