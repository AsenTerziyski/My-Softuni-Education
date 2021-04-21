package exercisingAfterAdvancedAndOOP;

import java.util.ArrayDeque;
import java.util.Scanner;

public class pr03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> integerArrayDeque = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            switch (input[0]) {
                case "1":
                    integerArrayDeque.push(Integer.parseInt(input[1]));
                    break;
                case "2":
                    if (checkIfStackIsNotEmpty(integerArrayDeque)) {
                        integerArrayDeque.pop();
                    }
                    break;
                case "3":
                    printlnMaxElement(integerArrayDeque);
                    break;
            }
        }
    }

    private static boolean checkIfStackIsNotEmpty(ArrayDeque<Integer> integerArrayDeque) {
        return !integerArrayDeque.isEmpty();
    }

    private static void printlnMaxElement(ArrayDeque<Integer> intStack) {
        int max = Integer.MIN_VALUE;
        if (checkIfStackIsNotEmpty(intStack)) {

            for (Integer integer : intStack) {
                if (integer > max) {
                    max = integer;
                }
            }

        }
        System.out.println(max);
    }
}
