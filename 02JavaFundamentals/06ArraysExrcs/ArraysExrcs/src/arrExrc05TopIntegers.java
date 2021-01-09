import java.util.Arrays;
import java.util.Scanner;

public class arrExrc05TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();

//        String[] inputArray = inputLine.split(" ");
//        int[] array = new int[inputArray.length];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(inputArray[i]);
//        }

        int[] array = Arrays
                .stream(inputLine.split("\\s+"))
                .mapToInt(s-> Integer.parseInt(s))
                .toArray();

        for (int i = 0; i < array.length - 1; i++) {
            boolean isTopInteger = false;
            //int currentNumb = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    isTopInteger = true;
                } else {
                    isTopInteger = false;
                    // заради този брейк ми дава 60/100!!!!
                    break;
                }
            }
            if (isTopInteger) {
                System.out.printf("%d ", array[i]);
            }
        }

        // този, последният принт е за да принтирам последното число,
        // което е по-голямо от тези, които не съществуват след него:
        System.out.printf("%d", array[array.length - 1]);
    }
}
