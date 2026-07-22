import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] banWords = sc.nextLine().split(", ");
        String text = sc.nextLine();
        for (String banWord : banWords) {
            if (text.contains(banWord)) {
                String replacement = repeatStr(banWord.length());
                text = text.replace(banWord, replacement);
            }
        }
        System.out.println(text);

        sc.close();
    }

    private static String repeatStr(int length) {
        return String.valueOf("*").repeat(Math.max(0, length));
    }
}
