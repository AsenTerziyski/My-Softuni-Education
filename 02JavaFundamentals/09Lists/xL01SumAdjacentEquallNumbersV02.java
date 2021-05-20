import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class xL01SumAdjacentEquallNumbersV02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputAsStringArray = scanner.nextLine().split(" ");
        ArrayList<Double> numbers = new ArrayList<>();

        for (int i = 0; i < inputAsStringArray.length; i++) {
            double currentNumber = Double.parseDouble(inputAsStringArray[i]);
            numbers.add(currentNumber);
        }

        int index = 0;
        while (index < numbers.size() - 1) {
            double current = numbers.get(index);
            double next = numbers.get(index + 1);

            if (current == next) {
                numbers.remove(index);
                numbers.set(index, current + next);
                index = 0;
            } else {
                index++;
            }
        }

        String output = joinElementsByDelimiter(numbers, " ");
        System.out.println(output);
    }

    private static String joinElementsByDelimiter(ArrayList<Double> numbers, String delimiter) {
        String output = "";
        for (Double number : numbers) {
            output = output + (new DecimalFormat("0.#").format(number) + delimiter);
        }
        return output;
    }
}
