import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String[] firstList = sc.nextLine().split("\\s+");
            String[] secondList = sc.nextLine().split("\\s+");

            for (String second : secondList) {
                for (String first : firstList) {
                    if (second.equals(first)) {
                        System.out.print(second + " ");
                    }
                }
            }
        } finally {
            sc.close();
        }
    }
}
