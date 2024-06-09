import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        int sum = 0;
        StringBuilder nums = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sum += i;
            nums.append(i).append(" ");
        }
        System.out.println(nums.toString().trim());
        System.out.printf("Sum: %d", sum);
    }
}
