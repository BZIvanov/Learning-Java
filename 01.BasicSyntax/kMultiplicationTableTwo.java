package company;

import java.util.Scanner;

public class kMultiplicationTableTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int start = Integer.parseInt(sc.nextLine());
        int end = start;
        if(start <= 10) {
            end = 10;
        }

        for(int i = start; i <= end; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
    }
}
