package company;

import java.util.Scanner;

public class iGreaterOfTwo {

    static int getMax(int first, int second) {
        return first > second ? first : second;
    }

    static char getMax(char first, char second) {
        return first > second ? first : second;
    }

    static String getMax(String first, String second) {
        return first.compareTo(second) > 0 ? first : second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.nextLine();

        switch (type) {
            case "int":
                int a = Integer.parseInt(sc.nextLine());
                int b = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(a, b));
                break;
            case "char":
                char i = sc.nextLine().charAt(0);
                char j = sc.nextLine().charAt(0);
                System.out.println(getMax(i, j));
                break;
            case "String":
                String x = sc.nextLine();
                String y = sc.nextLine();
                System.out.println(getMax(x, y));
                break;
        }
    }
}
