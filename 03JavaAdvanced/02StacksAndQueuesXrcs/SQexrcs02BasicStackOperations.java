import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SQexrcs02BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputString = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(inputString[0]);
        int s = Integer.parseInt(inputString[1]);
        int x = Integer.parseInt(inputString[2]);

//        int[] numbsInput = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
//        int n = numbsInput[0];
//        int s = numbsInput[1];
//        int x = numbsInput[2];
        ArrayDeque<Integer> numbersStack = new ArrayDeque<>();
        String[] inputNumbersAsString = scanner.nextLine().split("\\s+");

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(inputNumbersAsString[i]);
            numbersStack.push(currentNumber);
        }

        while (s > 0 && !numbersStack.isEmpty()) {
            numbersStack.pop();
            s--;
        }

        if (numbersStack.isEmpty()) {
            System.out.println(0);
        } else {
            if (numbersStack.contains(x)) {
                System.out.println("true");
            } else {
                Integer minEllement = Collections.min(numbersStack);
                System.out.println(minEllement);
            }
        }

    }
}
