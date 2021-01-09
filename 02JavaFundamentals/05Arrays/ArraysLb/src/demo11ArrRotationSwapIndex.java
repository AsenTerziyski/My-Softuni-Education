import java.util.Scanner;

public class demo11ArrRotationSwapIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        printRotationOfString(inputLine);

    }

    private static void printRotationOfString(String stringInputLine) {
        String[] inputStringArray = stringInputLine.split(" ");
        int[] numbersArray = new int[inputStringArray.length];

        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(inputStringArray[i]);
        }
        for (int i = 0; i < numbersArray.length / 2; i++) {
            int swapIndex = numbersArray.length - 1 - i;
            int oldNumbersI = numbersArray[i];
            numbersArray[i] = numbersArray[swapIndex];
            numbersArray[swapIndex] = oldNumbersI;
        }
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
