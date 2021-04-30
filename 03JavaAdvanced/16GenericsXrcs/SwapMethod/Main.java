package SwapMethod;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        SwapBox<String> stringSwapBox = new SwapBox<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            stringSwapBox.addElement(input);

        }

        int[] inputIndexes = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        stringSwapBox.swapElement(inputIndexes[0], inputIndexes[1]);
        stringSwapBox.getValues()
                .stream()
                .forEach(System.out::println);
    }

    static {
        System.out.println("EnterElements");
    }
}
