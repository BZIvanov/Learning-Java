import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brackets = sc.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        boolean areBalanced = true;
        for (int i = 0; i < brackets.length(); i++) {
            char current = brackets.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    areBalanced = false;
                    break;
                }

                char topElement = stack.pop();
                if (current == ')' && topElement != '(') {
                    areBalanced = false;
                    break;
                } else if (current == ']' && topElement != '[') {
                    areBalanced = false;
                    break;
                } else if (current == '}' && topElement != '{') {
                    areBalanced = false;
                    break;
                }
            }
        }

        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
