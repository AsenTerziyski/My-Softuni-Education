import java.util.Arrays;
import java.util.Scanner;

public class demo02ProcessingArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        int[] inputArray = new int[inputString.length];
        for (int i = 0; i <inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(inputString[i]);
        }

        int minValue = Arrays.stream(inputArray).min().getAsInt();
        System.out.println(minValue);

        //orElse дава стойност, примерно 2 както е в случая, ако е празен масива.
        minValue = Arrays.stream(new int[] {}).min().orElse(2);
        System.out.println(minValue);

        minValue = Arrays.stream(inputArray).min().orElse(5);
        System.out.println(minValue);

        int maxValue = Arrays.stream(inputArray).max().getAsInt();
        System.out.println(maxValue);

        int sum = Arrays.stream(inputArray).sum();
        System.out.println(sum);

        double avg = Arrays.stream(inputArray).average().getAsDouble();
        System.out.println(String.format("%.2f", avg));

    }
}
