import java.util.Arrays;
import java.util.Scanner;

public class FPLdemo03 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, -7, 5, 4, 15, -2, 0};

        //get first number greater than 3 and even and multiply it by two - 4*2 = 8
        int number = Arrays
                .stream(numbers)
                .filter(n -> n > 3)
                .filter(MathATT::isEven)
                .map(n -> n * 2)
                .findFirst()
                .getAsInt();

        System.out.println(number);

        //with FOR-LOOP:
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > 3 && numbers[i] % 2 == 0) {
//                System.out.println(numbers[i] * 2);
//                break;
//            }
//        }
    }
}
