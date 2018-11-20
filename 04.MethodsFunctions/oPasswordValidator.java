package company;

import java.util.Scanner;

public class oPasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();

        if(validatePassword(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validatePassword(String p) {
        boolean correctCharCount = validateCount(p);
        boolean onlyLettersAndDigits = validateContent(p);
        boolean haveTwoDigits = validateDigitsCount(p);

        if (correctCharCount && onlyLettersAndDigits && haveTwoDigits) {
            return true;
        }
        return false;
    }

    private static boolean validateDigitsCount(String p) {
        int digitCount = 0;

        for (int i = 0; i < p.length(); i++) {
            char symbol = p.charAt(i);
            if (Character.isDigit(symbol)) {
                digitCount++;
                if (digitCount >= 2) {
                    return true;
                }
            }
        }

        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean validateContent(String p) {
        for (int i = 0; i < p.length(); i++) {
            char symbol = p.charAt(i);
            // Character class has already implemented method to check for letter or number
            if(!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }

        return true;
    }

    private static boolean validateCount(String p) {
        boolean isValid =  p.length() > 5 && p.length() < 11;

        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }

        return true;
    }
}
