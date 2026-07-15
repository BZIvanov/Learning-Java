import java.util.Scanner;

public class DiagonalWidthMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (Math.abs(i - j) <= width) {
                    line.append("*  ");
                } else {
                    line.append("0  ");
                }
            }
            System.out.println(line);
        }

        sc.close();
    }
}
