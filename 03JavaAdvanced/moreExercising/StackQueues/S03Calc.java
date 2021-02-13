import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class S03Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split("\\s+");
        ArrayDeque<String> calc = new ArrayDeque<>();
        Collections.addAll(calc, tokens);
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
