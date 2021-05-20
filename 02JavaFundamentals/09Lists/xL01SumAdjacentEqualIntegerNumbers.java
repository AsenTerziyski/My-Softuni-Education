import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class xL01SumAdjacentEqualIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputAsString = scanner.nextLine().split(" ");
        int numbersInteger = 0;

         ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < inputAsString.length; i++) {
            numbersInteger = Integer.parseInt(inputAsString[i]);
            numbers.add(numbersInteger);
        }
//        List<Integer> numbers = new ArrayList<>();
//        for (Integer number : numbers) {
//            int i = 0;
//            number = Integer.parseInt(inputAsString[i++]);
//        }


// Първо решение от лекцията:
//        boolean search = true;
////        while (search) {
////            search = false;
////            for (int i = 0; i <numbers.size()-1; i++) {
////                int currentNumber = numbers.get(i);
////                int nextNumber = numbers.get(i+1);
////                if (currentNumber == nextNumber) {
////                    numbers.remove(i);
////                    numbers.set(i, currentNumber + nextNumber);
////                    search = true;
////                    break;
////                }
////            }
////        }

// Второ, по-кратко решение от лекцията:
        int index = 0;
        while (index < numbers.size() - 1) {
            int current = numbers.get(index);
            int next = numbers.get(index + 1);
            if (current == next) {
                numbers.remove(index);
                numbers.set(index, 2 * current);
                index = 0;
            } else {
                index++;
            }
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
