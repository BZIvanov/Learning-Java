package company;

import java.util.Scanner;

public class wRageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int games = Integer.parseInt(sc.nextLine());
        double headset = Double.parseDouble(sc.nextLine());
        double mouse = Double.parseDouble(sc.nextLine());
        double keyboard = Double.parseDouble(sc.nextLine());
        double display = Double.parseDouble(sc.nextLine());

        int headCount = games / 2;
        int mouseCount = games / 3;
        int keyboardCount = games / 6;
        int displayCount = games / 12;

        double cost = headCount * headset + mouseCount * mouse + keyboardCount * keyboard + displayCount * display;

        System.out.printf("Rage expenses: %.2f lv.", cost);
    }
}
