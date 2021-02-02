import java.util.Scanner;

public class demo07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[]{1, 2, 0, -5, 7, -8, 9};
        // nullNegativeValues(array);
        zeroNegativeValues(array);
        //int[] arrayExit = nullNegativeValues(array);
        printArray(array);
    }

    // Войд метод, който не връща нищо,
    // но след изпълнението му се променя масива,
    // защото масивът е референтен тип:
    private static void zeroNegativeValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
    }

    // Метод, който нулира отрицателни стойности в масив.
    private static int[] nullNegativeValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    private static void printArray(int[] inputArray) {
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }


}
