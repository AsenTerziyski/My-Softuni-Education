import java.util.Scanner;

public class ME01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        printSmallestOfThreeNumbers(a, b, c);
        // printSmallestOfThreeNumbersSecondVersion(a,b,c);


    }

    private static void printSmallestOfThreeNumbers(int a, int b, int c) {
        int[] numbers = {a, b, c};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(numbers[0]);
    }

    private static void printSmallestOfThreeNumbersSecondVersion(int a, int b, int c) {
        int[] numbers = {a, b, c};
        for (int i = 0; i < numbers.length; i++) {
            int tempSecond = numbers[i];
            if (numbers[i] <= numbers[i + 1]) {
                numbers[i] = tempSecond;
            } else {
                numbers[i + 1] = tempSecond;
            }
        }
        System.out.println(numbers[0]);
    }
}
