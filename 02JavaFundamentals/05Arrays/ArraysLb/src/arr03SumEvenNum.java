import java.util.Arrays;
import java.util.Scanner;

public class arr03SumEvenNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrayNumbers = input.split(" ");

        int[] numbersTwo = Arrays
                .stream(input.split("\\s+"))
                .mapToInt(inp-> Integer.parseInt(inp))
                .toArray();

        for (int i : numbersTwo) {
            System.out.println(i);
        }

        int sumTwo = Arrays.stream(numbersTwo).sum();
        System.out.println(String.format("SUM TWO = %d", sumTwo));


        int[] numbers = new int[arrayNumbers.length];
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(arrayNumbers[i]);
            if (numbers[i] % 2 == 0) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
    }
}
