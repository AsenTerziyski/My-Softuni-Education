import java.util.Scanner;

public class demo04ArrArrangeAscendingOrderNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputStringArray = scanner.nextLine().split(" ");

        int[] numbers = arrangeArrayNumbersInAscendingOrder(inputStringArray);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    private static int[] arrangeArrayNumbersInAscendingOrder(String[] inputStringArray) {
        int[] numbers = new int[inputStringArray.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputStringArray[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = numbers[i];
                if (numbers[i] > numbers[j]) {
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
