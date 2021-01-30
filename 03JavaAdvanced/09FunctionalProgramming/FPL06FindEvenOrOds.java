import java.util.Arrays;
import java.util.Scanner;

public class FPL06FindEvenOrOds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputRange = scanner.nextLine().split("\\s+");
        int lowBoundary = Integer.parseInt(inputRange[0]);
        int highBoundary = Integer.parseInt(inputRange[1]);

        int[] numbers = new int[highBoundary - lowBoundary + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = lowBoundary + i;
        }
        //System.out.println();
        String oddEven = scanner.nextLine();
        switch (oddEven) {
            case "odd":
                int[] filteredArrayOdds = Arrays.stream(numbers).filter(n -> n % 2 != 0).toArray();
                for (int i = 0; i < filteredArrayOdds.length; i++) {
                    System.out.print(filteredArrayOdds[i] + " ");
                }
                break;
            case "even":
                int[] filteredArrayEvens = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
                for (int i = 0; i < filteredArrayEvens.length; i++) {
                    System.out.print(filteredArrayEvens[i] + " ");
                }
                break;
        }
    }
}
