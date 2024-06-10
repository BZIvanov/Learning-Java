import java.util.Scanner;

public class RepeatString {
    static String wholeText(String text, int n) {
        return String.valueOf(text).repeat(Math.max(0, n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(wholeText(text, n));
    }
}
