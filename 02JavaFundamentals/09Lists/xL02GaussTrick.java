import java.util.ArrayList;
import java.util.Scanner;

public class xL02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        //parsedIntToList(inputString);
        ArrayList<Integer> manipulatedList = new ArrayList<>(parsedIntToList(inputString));
        for (int i = 0; i < manipulatedList.size()-1; i++) {
            int first = manipulatedList.get(i);
            int second = manipulatedList.get(manipulatedList.size()-1);
            manipulatedList.set(i, first + second);
            manipulatedList.remove(manipulatedList.size()-1);

        }

        printArrayListIntegerWithoutLastInterval(manipulatedList);

    }

    private static ArrayList<Integer> parsedIntToList(String inputString) {
        String[] inputArrayString = inputString.split(" ");
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i <inputArrayString.length; i++) {
            int current = Integer.parseInt(inputArrayString[i]);
            numbersList.add(current);
        }
        return numbersList;
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
