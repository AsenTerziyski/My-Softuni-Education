import java.util.ArrayDeque;
import java.util.Scanner;

public class SQpr04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = scanner.nextLine();
        ArrayDeque<Integer> indexesOpeningBrackets = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);

            if ('(' == symbol) {
                indexesOpeningBrackets.push(i);
            } else if (')' == symbol) {
                String outputSubstring = expression.substring(indexesOpeningBrackets.pop(), i + 1);
                System.out.println(outputSubstring);
            }

        }

//        // Other way to print Stack:
//        for (Integer indexesOpeningBracket : indexesOpeningBrackets) {
//            System.out.println(indexesOpeningBracket);
//        }

    }
}
