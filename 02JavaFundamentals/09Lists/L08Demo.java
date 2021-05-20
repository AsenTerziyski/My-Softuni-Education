import java.util.ArrayList;
import java.util.Scanner;

public class L08Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayList<Integer> numbers = parseIntList(inputString);
        printIntList(numbers);
    }

    private static void printIntList(ArrayList<Integer> numbers) {
        for (int i = 0; i <numbers.size(); i++) {
            if (i == numbers.size()-1) {
                System.out.print(numbers.get(i));
            } else {
                System.out.print(numbers.get(i) + "x");
            }
        }
    }

    private static ArrayList<Integer> parseIntList(String inputString) {
        String[] input = inputString.split("\\s+");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            numbers.add(Integer.parseInt(input[i]));
        }
        return numbers;
    }
}
