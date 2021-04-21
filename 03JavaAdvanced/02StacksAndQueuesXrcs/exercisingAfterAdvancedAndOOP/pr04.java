package exercisingAfterAdvancedAndOOP;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class pr04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        int[] integers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < input[0]; i++) {
            deque.offer(integers[i]);
        }

        for (int i = 0; i < input[1]; i++) {
            if (!deque.isEmpty()) {
                deque.poll();
            }
        }

        if (!deque.isEmpty()) {
            if (deque.contains(input[2])) {
                System.out.println(deque.contains(input[2]));

            } else {
                int min = Integer.MAX_VALUE;
                for (Integer integer : deque) {
                    if (min > integer) {
                        min = integer;
                    }
                }
                System.out.println(min);
            }

        } else {
            System.out.println(0);
        }
    }
}
