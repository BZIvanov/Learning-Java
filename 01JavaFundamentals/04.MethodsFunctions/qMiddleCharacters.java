package company;

import java.util.Scanner;

public class qMiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(getMiddleChars(str));
    }

    public static String getMiddleChars(String str) {
        String result = "";
        int middleIndex = str.length() / 2;

        if(str.length() % 2 == 0) {
            result += "" + str.charAt(middleIndex - 1) + str.charAt(middleIndex);
        } else {
            result += str.charAt(middleIndex);
        }

        return result;
    }
}
