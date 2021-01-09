import java.util.Scanner;

public class arr07CondenseArraysWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputArray = scanner.nextLine();

        System.out.println(condenseArray(inputArray));
    }

    private static int condenseArray(String inputString) {
        String[] stringArray = inputString.split(" ");

        int[] numbers = new int[stringArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(stringArray[i]);
        }

        while (numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];

            for (int i = 0; i < numbers.length - 1; i++) {
                condensed[i] = numbers[i] + numbers[i + 1];
            }
            numbers = condensed;
        }

        return numbers[0];
    }
}
