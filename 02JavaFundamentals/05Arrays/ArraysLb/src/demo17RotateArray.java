import java.util.Scanner;

public class demo17RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOne = parseIntArray(scanner);
        int[] arrayTwo = parseIntArray(scanner);

        arrayOne = rotateArray(arrayOne);
        arrayTwo = rotateArray(arrayTwo);

        printIntArray(arrayOne);
        printIntArray(arrayTwo);

    }

    private static void printIntArray(int[] arrayOne) {
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(arrayOne[i] + " ");
        }
        System.out.println();
    }

    private static int[] rotateArray(int[] inputIntArray) {
        for (int i = 0; i < inputIntArray.length / 2; i++) {
            int temp = inputIntArray[i];
            inputIntArray[i] = inputIntArray[inputIntArray.length - 1 - i];
            inputIntArray[inputIntArray.length - 1 - i] = temp;
        }
        return inputIntArray;
    }

    private static int[] parseIntArray(Scanner scanner) {
        String[] input = scanner.nextLine().split(" ");
        int[] numbsArray = new int[input.length];
        for (int i = 0; i < numbsArray.length; i++) {
            numbsArray[i] = Integer.parseInt(input[i]);
        }
        return numbsArray;
    }
}
