import java.util.Scanner;

public class PrintTriangle {
    static String printLine(int y) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= y; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
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
