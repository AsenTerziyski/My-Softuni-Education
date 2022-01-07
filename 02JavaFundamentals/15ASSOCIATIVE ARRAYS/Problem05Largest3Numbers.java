import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        List<Integer> sortedNumbers = getIntegersSortLimitPrint(inputString);

        for (int i = 0; i <sortedNumbers.size(); i++) {
            if (i==sortedNumbers.size()-1) {
                System.out.print(sortedNumbers.get(i));
            } else {
                System.out.print(sortedNumbers.get(i) + " ");
            }
        }
    }

    private static List<Integer> getIntegersSortLimitPrint(String[] inputString) {
        return Arrays.stream(inputString)
                    .map(num -> Integer.parseInt(num))
                    .sorted((n1,n2) -> n2.compareTo(n1))
                    .limit(3)
                    .collect(Collectors.toList());
    }
}
