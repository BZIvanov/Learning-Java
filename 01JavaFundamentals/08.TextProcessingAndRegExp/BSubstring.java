import java.util.Scanner;

public class BSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String keyWord = sc.nextLine();
        String text = sc.nextLine();
        int indexOfKey = text.indexOf(keyWord);

        while (indexOfKey != -1) {
            text = text.substring(0, indexOfKey) + text.substring(indexOfKey + keyWord.length());
            indexOfKey = text.indexOf(keyWord);
        }

        System.out.println(text);
    }
}
