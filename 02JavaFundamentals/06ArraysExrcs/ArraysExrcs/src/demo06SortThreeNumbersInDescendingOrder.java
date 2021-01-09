import java.util.Scanner;

public class demo06SortThreeNumbersInDescendingOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayNumbers = new int[3];
        for (int i = 0; i < arrayNumbers.length; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            arrayNumbers[i] = numbers;
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            for (int j = i + 1; j < arrayNumbers.length; j++) {
                if (arrayNumbers[i] < arrayNumbers[j]) {
                    int temp = arrayNumbers[i];
                    arrayNumbers[i] = arrayNumbers[j];
                    arrayNumbers[j] = temp;
                }
            }
        }
        for (int num : arrayNumbers) {
            System.out.println(num);
        }
    }
}
