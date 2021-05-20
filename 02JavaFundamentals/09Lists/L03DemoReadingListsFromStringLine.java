import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L03DemoReadingListsFromStringLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        readingListFromStringLine(scanner, numbersList);
//        for (int i = 0; i < numbersList.size(); i++) {
//            if (numbersList.get(i) < 0) {
//                numbersList.remove(i);
//                i = -1;
//            }
// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

        // този алгоритъм за премахване на елементи е универсален. Да ползвам него!
        int index = 0;
        while (index < numbersList.size()) {
            if (numbersList.get(index) < 0) {
                numbersList.remove(index);
            } else {
                index++;
            }
        }

// xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
//        for (int i = 0; i <inputStringAsArray.length; i++) {
//            int number = Integer.parseInt(inputStringAsArray[i]);
//            numbersList.add(number);
//        }

        System.out.println(numbersList);

        for (int i = 0; i <numbersList.size(); i++) {
            if (i==numbersList.size()-1) {
                System.out.print(numbersList.get(i));
            } else {
                System.out.print(numbersList.get(i) + "/");
            }
        }
    }

    private static void readingListFromStringLine(Scanner scanner, ArrayList<Integer> numbersList) {
        String inputString = scanner.nextLine();
        String[] inputStringAsArray = inputString.split(" ");
//        for (String s : inputStringAsArray) {
//            int number = Integer.parseInt(s);
//            numbersList.add(number);
//        }

        int[] numbersArray = new int[inputStringAsArray.length];
        numbersArray = Arrays.stream(inputStringAsArray).mapToInt(s-> Integer.parseInt(s)).toArray();
        for (int i = 0; i < numbersArray.length; i++) {
            numbersList.add(numbersArray[i]);
        }
    }
}
