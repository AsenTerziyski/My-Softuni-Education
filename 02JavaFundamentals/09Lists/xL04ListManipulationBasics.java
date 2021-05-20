import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class xL04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayString = scanner.nextLine().split(" ");
        ArrayList<Integer> numbersArray = parseIntegerArray(arrayString);
        String inputCommands = scanner.nextLine();
        while (!inputCommands.equals("end")) {
            String[] arrayInputCommands = inputCommands.split(" ");

            switch (arrayInputCommands[0]) {
                case "Add":
                    int addNumb = Integer.parseInt(arrayInputCommands[1]);
                    numbersArray.add(Integer.valueOf(addNumb));
                    break;
                case "Remove":
                    int numberToRemove = Integer.parseInt(arrayInputCommands[1]);
                    numbersArray.remove(Integer.valueOf(numberToRemove));
                    break;
                case "RemoveAt":
                    int index = Integer.parseInt(arrayInputCommands[1]);
                    numbersArray.remove(index);
                    break;
                case "Insert":
                    int numberToIncert = Integer.parseInt(arrayInputCommands[1]);
                    int indexToIncert = Integer.parseInt(arrayInputCommands[2]);
                    numbersArray.add(indexToIncert, numberToIncert);
                    break;
            }
            inputCommands = scanner.nextLine();
        }

        printArrayListIntegerWithoutLastInterval(numbersArray);
    }

    private static ArrayList<Integer> parseIntegerArray(String[] arrayString) {
//        ArrayList<Integer> numbersArray = new ArrayList<>();
//        for (int i = 0; i < arrayString.length; i++) {
//            int current = Integer.parseInt(arrayString[i]);
//            numbersArray.add(current);
//        }
        ArrayList<Integer> numbersArray = (ArrayList<Integer>) Arrays
                .stream(arrayString)
                .map(s-> Integer.parseInt(s))
                .collect(Collectors.toList());

        return numbersArray;
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
