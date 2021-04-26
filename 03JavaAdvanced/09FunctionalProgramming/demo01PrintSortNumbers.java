import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class demo01PrintSortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream<String> strings = Arrays.stream(scanner.nextLine()
                        .split(" "));

        int[] ints = strings
                .mapToInt(Integer::parseInt)
                .filter(n -> n % 2 == 0).toArray();

        Arrays.sort(ints);

        printNumbers(ints, "-");

        //1, 7, 100, 99, 1025, 2, 4, 3, 8, 9, 6
        //2,*4,*6,*8,*100
    }

    private static void printNumbers(int[] ints, String delimiter) {
        StringBuilder sb = new StringBuilder();
        for (int anInt : ints) {
            sb.append(anInt + delimiter);
        }
        if (sb.length()>=3) {
            System.out.println(sb.substring(0, sb.length() - 1).trim());
        } else {
            System.out.println(sb.toString());
        }
    }
}
