import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] items = sc.nextLine().split(" ");

        for (int i = 0; i < items.length / 2; i++) {
            String temp = items[i];
            items[i] = items[items.length - 1 - i];
            items[items.length - 1 - i] = temp;
        }

        for (String item : items) {
            System.out.print(item + " ");
        }

        sc.close();
    }
}
