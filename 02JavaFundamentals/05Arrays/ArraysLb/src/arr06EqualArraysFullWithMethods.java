import java.util.Arrays;
import java.util.Scanner;

public class arr06EqualArraysFullWithMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] frstArray = parseStrArrToIntArr(scanner);
        int[] scndArray = parseStrArrToIntArr(scanner);

        boolean areEqual = true;
        int sum = 0;
        if (frstArray.length == scndArray.length) {
            for (int i = 0; i < frstArray.length; i++) {
                if (frstArray[i] != scndArray[i]) {
                    areEqual = false;
                    System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                    break;
                } else {
                    sum = sum + frstArray[i];
                }
            }
        } else {
            areEqual = false;
        }
        if (areEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }

    private static int[] parseStrArrToIntArr(Scanner scanner) {
//        String[] stringArray = scanner.nextLine().split(" ");
//        int[] frstArray = new int[stringArray.length];
//        for (int i = 0; i < frstArray.length; i++) {
//            frstArray[i] = Integer.parseInt(stringArray[i]);
//        }
        //return frstArray;
        int[] intArray = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(s-> Integer.parseInt(s))
                .toArray();
        return intArray;
    }

}
