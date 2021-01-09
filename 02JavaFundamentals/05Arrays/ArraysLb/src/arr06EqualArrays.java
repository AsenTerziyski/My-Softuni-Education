import java.util.Arrays;
import java.util.Scanner;

public class arr06EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFirstArr = scanner.nextLine();
        String inputSecondArr = scanner.nextLine();

        String[] firstArr = inputFirstArr.split(" ");
        String[] secondArr = inputSecondArr.split(" ");

//        int[] arryOne = new int[firstArr.length];
//        int[] arryTwo = new int[secondArr.length];

        int[] arryOne = Arrays
                .stream(inputFirstArr.split("\\s+"))
                .mapToInt(sOne -> Integer.parseInt(sOne))
                .toArray();

        int[] arryTwo = Arrays
                .stream(inputFirstArr.split("\\s+"))
                .mapToInt(sTwo -> Integer.parseInt(sTwo))
                .toArray();

        int sum = 0;
        boolean areNotIdentical = false;

        for (int i = 0; i < arryOne.length; i++) {
//            arryOne[i] = Integer.parseInt(firstArr[i]);
//            arryTwo[i] = Integer.parseInt(secondArr[i]);
            if (arryOne[i] != arryTwo[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areNotIdentical = true;
                break;
            }

            sum = sum + arryOne[i];
        }

        if (areNotIdentical == false) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
