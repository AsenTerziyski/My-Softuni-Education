import java.util.ArrayList;
import java.util.Scanner;

public class xL03MergingListsOfIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFirstString = scanner.nextLine();
        String inputSecondString = scanner.nextLine();
        //parseLineOfIntegerNumbers(inputString);
        ArrayList<Integer> firstList = new ArrayList<>(parseLineOfIntegerNumbers(inputFirstString));
        ArrayList<Integer> secondList = new ArrayList<>(parseLineOfIntegerNumbers(inputSecondString));

        int indexFirstList = 0;
        int indexSecondList = 0;
        ArrayList<Integer> mergedList = new ArrayList<>();
        while (indexFirstList < firstList.size() || indexSecondList < secondList.size()) {
            if (indexFirstList < firstList.size()) {
                mergedList.add(firstList.get(indexFirstList));
            }
            if (indexSecondList < secondList.size()) {
                mergedList.add(secondList.get(indexSecondList));
            }
            indexFirstList++;
            indexSecondList++;
        }

        for (Integer integer : mergedList) {
            System.out.print(integer + " ");
        }


    }

    private static ArrayList<Integer> parseLineOfIntegerNumbers(String inputString) {
        String[] inputNumbersAsStringArray = inputString.split(" ");
        ArrayList<Integer> listIntegerNumbers = new ArrayList<>();
        for (int i = 0; i < inputNumbersAsStringArray.length; i++) {
            int currentNumber = Integer.parseInt(inputNumbersAsStringArray[i]);
            listIntegerNumbers.add(currentNumber);
        }
        return listIntegerNumbers;

    }
}
