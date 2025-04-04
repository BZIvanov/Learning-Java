import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        while (n % 2 != 0) {
            System.out.println("Please write an even number.");
            n = Integer.parseInt(sc.nextLine());
        }

        if (n < 0) {
            n *= -1;
        }

        System.out.printf("The number is: %d", n);

        sc.close();
    }
}
