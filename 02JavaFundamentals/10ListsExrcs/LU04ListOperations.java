import java.util.ArrayList;
import java.util.Scanner;

public class LU04ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            //int parsedNumber = Integer.parseInt(input[i]);
            numbersList.add(Integer.parseInt(input[i]));
        }
        String inputCommands = scanner.nextLine();
        while (!inputCommands.equals("End")) {
            String[] inputCommandsAsArray = inputCommands.split("\\s+");
            String command = inputCommandsAsArray[0];

            switch (command) {
                case "Shift":
                    int count = Integer.parseInt(inputCommandsAsArray[2]);
                    shiftArrayCountTimes(numbersList, inputCommandsAsArray[1], count);
                    break;
                case "Add":
                    int numberToAdd = Integer.parseInt(inputCommandsAsArray[1]);
                    numbersList.add(numberToAdd);
                    break;
                case "Insert":
                    Integer numberToInsert = Integer.parseInt(inputCommandsAsArray[1]);
                    int indexToInsert = Integer.parseInt(inputCommandsAsArray[2]);
                    if (checkIndexIsValid(numbersList, indexToInsert)) {
                        numbersList.add(indexToInsert, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(inputCommandsAsArray[1]);
                    if (checkIndexIsValid(numbersList, indexToRemove)) {
                        numbersList.remove(indexToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
            }

            inputCommands = scanner.nextLine();
        }
//        for (Integer integer : numbersList) {
//            System.out.print(integer + " ");
//        }
        printIntListWithoutLastInterval(numbersList);

    }

    private static void printIntListWithoutLastInterval(ArrayList<Integer> numbersList) {
        for (int i = 0; i < numbersList.size(); i++) {

            if (i == numbersList.size() - 1) {
                System.out.print(numbersList.get(i));
            } else {
                System.out.print(numbersList.get(i) + " ");
            }

        }
    }

    private static boolean checkIndexIsValid(ArrayList<Integer> numbersList, int indexToInsert) {
        return indexToInsert >= 0 && indexToInsert < numbersList.size();
    }

    private static void shiftArrayCountTimes(ArrayList<Integer> intList, String leftOrRight, int count) {

        if (leftOrRight.equals("left")) {
            for (int i = 0; i < count; i++) {
                Integer temp = intList.get(0);
                intList.remove(0);
                intList.add(Integer.valueOf(temp));
            }

        } else if (leftOrRight.equals("right")) {
            for (int i = 0; i < count; i++) {
                int lastIndex = intList.size() - 1;
                Integer temp = intList.get(lastIndex);
                intList.remove(lastIndex);
                intList.add(0, temp);
            }

        }
    }
}
