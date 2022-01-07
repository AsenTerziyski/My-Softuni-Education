import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem05Largest3Numbers02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        List<Integer> sortedNumbers = getIntegersSortLimitPrint(inputString);

        for (int i = 0; i <sortedNumbers.size(); i++) {
            if (sortedNumbers.size() > 3) {
                System.out.println(sortedNumbers.get(i));
            } else {

        }



        }
    }

    private static List<Integer> getIntegersSortLimitPrint(String[] inputString) {
        return Arrays.stream(inputString)
                .map(num -> Integer.parseInt(num))
                .sorted((n1,n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
    }
}
