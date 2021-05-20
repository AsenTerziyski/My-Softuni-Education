import java.util.ArrayList;
import java.util.Scanner;

public class LU06CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> first = new ArrayList<>(readParsListIntegers(scanner));
        ArrayList<Integer> second = new ArrayList<>(readParsListIntegers(scanner));

        while (first.size() != 0 && second.size() != 0) {

            int firstCard = first.get(0);
            int secondCard = second.get(0);

            if (firstCard > secondCard) {
                first.add(firstCard);
                first.add(secondCard);
                first.remove(0);
                second.remove(0);
            } else if (secondCard > firstCard) {
                second.add(secondCard);
                second.add(firstCard);
                second.remove(0);
                first.remove(0);
            } else {
                first.remove(0);
                second.remove(0);
            }
        }

        if (first.size() > 0) {
            int sum = getSumOfNumbersInTheList(first);
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            int sum = getSumOfNumbersInTheList(second);
            System.out.printf("Second player wins! Sum: %d", sum);
        }

    }

    private static int getSumOfNumbersInTheList(ArrayList<Integer> first) {
        int sum = 0;
        for (Integer integer : first) {
            sum = sum + integer;
        }
        return sum;
    }

    private static ArrayList<Integer> readParsListIntegers(Scanner scanner) {
        String[] inputFirstPlayer = scanner.nextLine().split("\\s");
        ArrayList<Integer> parsedArrayList = new ArrayList<>();
        for (int i = 0; i < inputFirstPlayer.length; i++) {
            parsedArrayList.add(Integer.parseInt(inputFirstPlayer[i]));
        }
        return parsedArrayList;
    }
}
