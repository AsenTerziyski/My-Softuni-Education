import java.util.ArrayDeque;
import java.util.Scanner;

public class SQpr02Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (Character.isDigit(token.charAt(0))) {
                numbers.push(Integer.parseInt(token));

            } else {
                int rightOperand = Integer.parseInt(tokens[++i]);
                int leftOperand = numbers.peek();
                numbers.push(rightOperand);

                int result = getResult(token, rightOperand, leftOperand);

//                int result = token.equals("+")
//                        ? result = leftOperand + rightOperand
//                        : leftOperand - rightOperand;
//                // ? - if, : - else

                numbers.push(result);
            }
        }

        System.out.println(numbers.peek());

        // принтниренае на стек:

//        while (numbers.size() != 0) {
//            System.out.println(numbers.pop());
//        }

//        while (!numbers.isEmpty()) {
//            System.out.println(numbers.pop());
//        }

    }

    private static int getResult(String token, int rightOperand, int leftOperand) {
        int result = 0;
        switch (token) {
            case "+":
                result = rightOperand + leftOperand;
                break;
            case "-":
                result = leftOperand - rightOperand;
                break;
        }
        return result;
    }
}
