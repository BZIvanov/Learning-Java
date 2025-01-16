import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String country = sc.nextLine();

        switch (country) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }

        sc.close();
    }
}
