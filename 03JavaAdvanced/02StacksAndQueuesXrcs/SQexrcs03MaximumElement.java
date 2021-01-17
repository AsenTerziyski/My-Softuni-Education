import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SQexrcs03MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            switch (command) {
                case "1":
                    int currentNumber = Integer.parseInt(input[1]);
                    numbers.push(currentNumber);
                    break;
                case "2":
                    if (!numbers.isEmpty()) {
                        numbers.pop();
                    }
                    break;
                case "3":
//                    Integer maxElement = Collections.max(numbers);
//                    System.out.println(maxElement);
                    Integer maxElement = getMaxEllement(numbers);
                    System.out.println(maxElement);
                    break;
            }

        }
    }

    private static int getMaxEllement(ArrayDeque<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        while (!numbers.isEmpty()) {
            int currentEllement = numbers.pop();
            max = Math.max(max, currentEllement);
        }
        return max;
    }
}
