import java.util.Scanner;

public class SQ02demoGetSumNumberOfSteps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] array = fillIntArray(scanner, n);

        int sumEven = getSumEven(array);
        System.out.println(sumEven);

    }

    private static int[] fillIntArray(Scanner scanner, int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            int currentNumb = Integer.parseInt(scanner.nextLine());
            array[i] = currentNumb;
        }
        return array;
    }

    private static int getSumEven(int[] array) {
        int sumEvenElement = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                sumEvenElement = sumEvenElement + array[i];
            }

        }
        return sumEvenElement;
    }
}
