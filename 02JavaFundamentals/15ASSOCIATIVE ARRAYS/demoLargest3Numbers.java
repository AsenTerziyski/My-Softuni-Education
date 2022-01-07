import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class demoLargest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");

        List<Integer> collect = parseSortLimitCollectToIneger(inputString);
        printCollection(collect);

    }

    private static List<Integer> parseSortLimitCollectToIneger(String[] inputString) {
        return Arrays.stream(inputString)
                    .map(s -> Integer.parseInt(s))
                    .sorted((a, b) -> Integer.compare(b, a))
                    .limit(5)
                    .collect(Collectors.toList());
    }

    private static void printCollection(List<Integer> collect) {
        for (int i = 0; i < collect.size(); i++) {
            if (i == collect.size() - 1) {
                System.out.print(collect.get(i));
            } else {
                System.out.print(collect.get(i) + " ");
            }
        }
    }

}
