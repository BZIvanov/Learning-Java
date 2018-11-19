package company;

import java.util.Scanner;

public class cPrintTriangle {

    static String printLine(int y) {
        String result = "";
        for (int i = 1; i <= y; i++) {
            result += i + " ";
        }
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println(printLine(i));
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.println(printLine(i));
        }
    }
}
