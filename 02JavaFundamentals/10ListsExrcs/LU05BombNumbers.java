import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LU05BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumbers = getParseIntegersFromScanner(scanner);

        String[] input = scanner.nextLine().split("\\s+");
        Integer specialBombNumber = Integer.parseInt(input[0]);

        int power = Integer.parseInt(input[1]);
        int bomb = Integer.parseInt(input[0]);
        int index = 0;

        while (listNumbers.contains(bomb)) {
            index = listNumbers.indexOf(bomb);
            int leftBound = Math.max(0, index - power);
            int rightBound = Math.min(power + index, listNumbers.size() - 1);

            for (int i = rightBound; i >= leftBound; i--) {
                listNumbers.remove(i);
            }

        }

        int sum = sumNumbOfList(listNumbers);
        System.out.println(sum);
    }

    private static int sumNumbOfList(List<Integer> listNumbers) {
        int sum = 0;
        for (Integer number : listNumbers) {
            sum = sum + number;
        }
        return sum;

    }

    private static List<Integer> getParseIntegersFromScanner(Scanner scanner) {
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
//        for (int i = 0; i < inputString.length; i++) {
//            Integer number = Integer.parseInt(inputString[i]);
//            listNumbers.add(number);
//        }
        return listNumbers;
    }
}
