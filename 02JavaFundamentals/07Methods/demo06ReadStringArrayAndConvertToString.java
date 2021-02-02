import java.util.Scanner;

public class demo06ReadStringArrayAndConvertToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = readArray(scanner);
        int[] secondArray = readArray(scanner);
        printArray(secondArray);
        printArray(firstArray);
    }

    private static void printArray(int[] inputArray) {
        for (int i : inputArray) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    private static int[] readArray(Scanner scanner) {
        // По-добре е четенето да е в мейн метода:
        // Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        int[] arrayNumbers = new int[inputString.length];
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = Integer.parseInt(inputString[i]);
        }
        return arrayNumbers;
    }
}
