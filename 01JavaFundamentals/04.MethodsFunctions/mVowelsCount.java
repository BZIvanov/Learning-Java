package company;

import java.util.Scanner;

public class mVowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        System.out.println(countVowels(text));
    }

    public static int countVowels(String s) {
        int count = 0;
        String strToLower = s.toLowerCase();
        for (int i = 0; i < strToLower.length(); i++) {
            switch (strToLower.charAt(i)) {
                case 'a':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
            }
        }

        return count;
    }
}
