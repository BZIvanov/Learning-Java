package company;

import java.util.Scanner;

public class zzMethodExamples {

    static void printHelloWorld() {
        // static is always used
        // void is because this method doesn't return anything, just prints a message
        // printHelloWorld is the name of the method and in this case it takes no parameters
        System.out.println("Hello World!");
    }

    static void printSpecificChar(char item, int times) {
        // in the brackets we specify the type of parameters and variable name  to use them
        for (int i = 0; i < times; i++) {
            System.out.print(item);
        }
        System.out.println();
    }

    static String getSpecificChar(char item, int times) {
        // return type of the variable in this case have to be string because the method is static String which means it returns only String
        String result = "";
        for (int i = 0; i < times; i++) {
            result += item;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // void method which takes no parameters
        printHelloWorld();

        System.out.println("---------------");

        // void method which takes parameters
        printSpecificChar('*', 3);

        System.out.println("---------------");

        // return String result from method. In this case wrap the method in print to see the result
        System.out.println(getSpecificChar('#', 5));
    }
}
