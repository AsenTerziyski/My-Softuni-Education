package G03ProblemGenericSwapMethodStrings;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<String>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            box.addValue(input);
        }
//        String[] indexes = scanner.nextLine().split("\\s+");
//        int index1 = Integer.parseInt(indexes[0]);
//        int index2 = Integer.parseInt(indexes[1]);
        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(index -> Integer.parseInt(index))
                .toArray();
        int indexOne = indexes[0];
        int indexTwo = indexes[1];
        box.swap(indexOne, indexTwo);
        System.out.println(box);
    }
}
