// java.util.Scanner is also package, but not our own
// import Scanner class, which will allow us to read user input from the console
import java.util.Scanner;

public class StudentInformation {
    // main method is the starting point for our class
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age =  Integer.parseInt(sc.nextLine());
        double grade = Double.parseDouble(sc.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
    }
}
