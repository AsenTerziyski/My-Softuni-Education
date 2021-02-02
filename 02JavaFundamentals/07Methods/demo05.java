import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputFirstArray = scanner.nextLine().split(" ");
        String[] inputSecondArray = scanner.nextLine().split(" ");

        int[] firstArray = convertArrayFromStringToInteger(inputFirstArray);
        int[] secondArray = convertArrayFromStringToInteger(inputSecondArray);

        for (int i : secondArray) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (int i : firstArray) {
            System.out.print(i + " ");
        }
    }

    private static int[] convertArrayFromStringToInteger(String[] inputString) {
        int[] returnIntegerArray = new int[inputString.length];
        for (int i = 0; i < returnIntegerArray.length; i++) {
            returnIntegerArray[i] = Integer.parseInt(inputString[i]);
        }
        return returnIntegerArray;
    }
}
