package com.company;

import java.util.Scanner;

public class rLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user = sc.nextLine();
        String password = new StringBuffer(user).reverse().toString();

        int blocked = 0;
        while (true) {
            String input = sc.nextLine();
            blocked++;
            if(input.equals(password)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                if(blocked == 4) {
                    System.out.printf("User %s blocked!", user);
                    break;
                }

                System.out.println("Incorrect password. Try again.");
            }
        }
    }
}
