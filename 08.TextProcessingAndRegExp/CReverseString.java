import java.util.Scanner;

public class CReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        while (!"end".equals(line)) {
            String reversed = "";
            for (int i = line.length() - 1; i >= 0; i--) {
                reversed += line.charAt(i);
            }
            System.out.println(String.format("%s = %s", line, reversed));

            line = sc.nextLine();
        }
    }
}
