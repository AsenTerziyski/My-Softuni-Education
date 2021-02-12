import java.util.*;

public class SQ03CalcV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 + 2*5 + 10 -5*2;
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> calc = new ArrayDeque<>();
        int i = 0;

        while (i < input.length) {
            calc.push(input[i]);
            if (input[i].equals("*") || input[i].equals("/")) {
                String op = calc.pop();
                int firstNumber = Integer.parseInt(calc.pop());
                i++;
                int secondNumber = Integer.parseInt(input[i]);
                int result = 0;
                switch (op) {
                    case "*":
                        result = firstNumber * secondNumber;
                        calc.push(String.valueOf(result));
                        break;
                    case "/":
                        result = firstNumber / secondNumber;
                        calc.push(String.valueOf(result));
                        break;
                }
            }
            i++;
        }

        while (calc.size() > 1) {
            int firstNumber = Integer.parseInt(calc.pop());
            String op = calc.pop();
            int secondNumber = Integer.parseInt(calc.pop());
            int result = 0;
            switch (op) {
                case "+":
                    result = firstNumber + secondNumber;
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    break;
            }
            calc.push(String.valueOf(result));
        }
        System.out.println("Sum:" + System.lineSeparator() + calc.pop());

    }
}
