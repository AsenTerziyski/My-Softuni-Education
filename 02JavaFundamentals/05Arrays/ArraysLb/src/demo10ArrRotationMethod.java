import java.util.Scanner;

// Обръщане на стринг масив в инт масив на обратно, независимо от брия на спейсовете:
public class demo10ArrRotationMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] exitArr = reverseStringÂrrayToIntArray(input);

        for (int i = 0; i < exitArr.length; i++) {
            System.out.print(exitArr[i] + " ");

        }
    }

    private static int[] reverseStringÂrrayToIntArray(String input) {

        String[] inputStringArray = input.split("\\s+");

        int[] arrayRotated = new int[inputStringArray.length];
        for (int i = 0; i < arrayRotated.length; i++) {
            arrayRotated[i] = Integer.parseInt(inputStringArray[i]);
        }

        int[] tempArray = new int[arrayRotated.length];
        for (int i = 0; i < arrayRotated.length; i++) {
            tempArray[i] = arrayRotated[arrayRotated.length - 1 - i];
        }

        arrayRotated = tempArray;

        return arrayRotated;
    }
}
