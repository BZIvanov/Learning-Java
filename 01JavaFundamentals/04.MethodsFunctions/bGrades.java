package company;

import java.util.Scanner;

public class bGrades {

    static void printGrade(double grade) {
        if (grade >= 2.0 && grade < 3.0) {
            System.out.println("Fail");
        } else if (grade <= 3.49) {
            System.out.println("Poor");
        } else if (grade <= 4.49) {
            System.out.println("Good");
        } else if (grade <= 5.49) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n = Double.parseDouble(sc.nextLine());
        printGrade(n);
    }
}
