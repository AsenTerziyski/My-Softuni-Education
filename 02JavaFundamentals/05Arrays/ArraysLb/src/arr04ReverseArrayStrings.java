import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class arr04ReverseArrayStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
//        String[] arrStrings = input.split(" ");

        int [] numb = stream(input.split("\\s+")).mapToInt(s-> Integer.parseInt(s)).toArray();
        for (int i = 0; i <numb.length/2; i++) {
            int oldElement = numb[i];
            numb[i] = numb[numb.length-1-i];
            numb[numb.length-1-i] = oldElement;
        }

        for (int i = 0; i <numb.length; i++) {
            System.out.print(String.format("%d ", numb[i]));
        }
        System.out.println();
        int sumFirstThreeReversed = Arrays.stream(numb).limit(3).sum();
        System.out.println(String.format("SUM FIRST THREE REVERSED NUMBERS = %d !", sumFirstThreeReversed));

//        for (int i = arrStrings.length - 1; i >= 0; i--) {
//            System.out.print(arrStrings[i] + " ");
//        }
    }
}
