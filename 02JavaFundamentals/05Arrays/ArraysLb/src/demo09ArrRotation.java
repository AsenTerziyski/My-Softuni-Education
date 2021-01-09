import java.util.Scanner;

public class demo09ArrRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] inputArray = new int[n];
        int[] tempArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = Integer.parseInt(scanner.nextLine());
            tempArray[tempArray.length - 1 - i] = inputArray[i];
        }

        inputArray = tempArray;
        for (int i = 0; i <inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
