package company;

        import java.util.Scanner;

public class gRepeatString {

    static String wholeText(String text, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += text;
        }
        return  result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        int n = Integer.parseInt(sc.nextLine());

        System.out.println(wholeText(text, n));
    }
}
