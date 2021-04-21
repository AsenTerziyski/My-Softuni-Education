package exercisingAfterAdvancedAndOOP;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class pr01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> integerStack = new ArrayDeque<>();
        Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(integerStack::push);

        while (integerStack.size() > 1) {
            System.out.print(integerStack.pop() + " ");
        }

        if (integerStack.size() == 1) {
            System.out.print(integerStack.pop());
        }
    }
}
