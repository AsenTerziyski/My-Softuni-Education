import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class xL07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < inputString.length; i++) {
            int current = Integer.parseInt(inputString[i]);
            numbers.add(current);
        }
        //Collections.sort(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0) {
                numbers.remove(i);
                i = i - 1;
            }
        }

        Collections.reverse(numbers);

        if (numbers.isEmpty()) {
            System.out.println("empty");
        } else {
            //System.out.println(numbers.toString().replaceAll("[\\[\\],]",""));
            printArrayListIntegerWithoutLastInterval(numbers);
        }
    }
    private static void printArrayListIntegerWithoutLastInterval(ArrayList<Integer> evenNumbers) {
        for (int i = 0; i < evenNumbers.size(); i++) {
            if (i == evenNumbers.size() - 1) {
                System.out.print(evenNumbers.get(i));
            } else {
                System.out.print(evenNumbers.get(i) + " ");
            }
        }
        System.out.println();
    }
}
