import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SQexrcs04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstInput = scanner.nextLine().split("\\s+");
        int[] firstLine = Arrays.stream(firstInput).mapToInt(s -> Integer.parseInt(s)).toArray();
        int n = firstLine[0];
        int s = firstLine[1];
        int x = firstLine[2];

        String[] secondInput = scanner.nextLine().split("\\s+");
        int[] secondLine = Arrays.stream(secondInput).mapToInt(p -> Integer.parseInt(p)).toArray();

        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();

        for (int i = 0; i < secondLine.length; i++) {
            int currentNumber = secondLine[i];
            numbersQueue.offer(currentNumber);

        }

        while (s > 0 && !numbersQueue.isEmpty()) {
            numbersQueue.poll();
            s--;
        }

        if (!numbersQueue.isEmpty()) {
            if (numbersQueue.contains(x)) {
                System.out.println("true");
            } else {
                int smallestElement = Collections.min(numbersQueue);
                System.out.println(smallestElement);
            }
        } else {
            System.out.println(0);
        }

    }
}
