import java.util.ArrayDeque;
import java.util.Scanner;

public class SQexrcs06BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sequence = scanner.nextLine();
        ArrayDeque<Character> stackOfCharacters = new ArrayDeque<>();
        boolean isBalanced = true;

        for (int i = 0; i < sequence.length(); i++) {
            char symbol = sequence.charAt(i);

            if (symbol == '{' || symbol == '(' || symbol == '[') {
                stackOfCharacters.push(symbol);
            } else {

                if (stackOfCharacters.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                char last = stackOfCharacters.pop();

                if (last == '{' && symbol != '}') {
                    isBalanced = false;
                    break;
                } else if (last == '(' && symbol != ')') {
                    isBalanced = false;
                    break;
                } else if (last == '[' && symbol != ']') {
                    isBalanced = false;
                    break;
                }

            }

        }

        if (isBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
