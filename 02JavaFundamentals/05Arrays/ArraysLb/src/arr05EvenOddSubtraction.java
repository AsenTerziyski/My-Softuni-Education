import java.util.Arrays;
import java.util.Scanner;

public class arr05EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //String [] inputArray = input.split(" ");
        //int[] numbers = new int[inputArray.length];

        int sumEven = 0;
        int sumOdd = 0;

        int [] numbers = Arrays
                .stream(input.split("\\s+"))
                .mapToInt(stringNumber-> Integer.parseInt(stringNumber))
                .limit(3)
                .toArray();

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] %2==0) {
                sumEven = sumEven + numbers[i];
            } else {
                sumOdd = sumOdd + numbers[i];
            }
        }
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = Integer.parseInt(inputArray[i]);
//            if (numbers[i] % 2 == 0) {
//                sumEven = sumEven + numbers[i];
//            } else {
//                sumOdd = sumOdd + numbers[i];
//            }
//        }
        System.out.println(sumEven - sumOdd);
    }
}
