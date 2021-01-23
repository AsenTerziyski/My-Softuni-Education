import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SM03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstDeck = getSetOfIntegers(scanner);
        Set<Integer> secondDeck = getSetOfIntegers(scanner);

        int round = 50;
        while (round > 0 && !firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int first = firstDeck.iterator().next();
            firstDeck.remove(first);

            int second = secondDeck.iterator().next();
            secondDeck.remove(second);

            if (first > second) {
                firstDeck.add(first);
                firstDeck.add(second);
            } else if (second > first) {
                secondDeck.add(first);
                secondDeck.add(second);
            }

            round--;
        }

        if (firstDeck.size() == secondDeck.size()) {
            System.out.println("Draw!");
        } else if (secondDeck.size() > firstDeck.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("First player win!");
        }

    }

    private static Set<Integer> getSetOfIntegers(Scanner scanner) {
        String[] stringInput = scanner.nextLine().split("\\s+");
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < stringInput.length; i++) {
            set.add(Integer.parseInt(stringInput[i]));
        }
        return set;
    }
}
