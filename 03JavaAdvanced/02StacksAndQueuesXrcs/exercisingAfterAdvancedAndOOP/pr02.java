package exercisingAfterAdvancedAndOOP;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class pr02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int n = input[0];
        int s = input[1];
        int x = input[2];

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < s; i++) {
            Integer pop = stack.pop();
        }

        int min = Integer.MAX_VALUE;

        if (stack.isEmpty()) {
            System.out.println(0);
        } else {
            if (stack.contains(x)) {
                System.out.println(stack.contains(x));
            } else {
                for (Integer integer : stack) {
                    if (min > integer) {
                        min = integer;
                    }
                }

                System.out.println(min);
            }
        }

    }
}
