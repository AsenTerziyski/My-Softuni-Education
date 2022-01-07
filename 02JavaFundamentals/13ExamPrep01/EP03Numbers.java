import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class EP03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");
        ArrayList<Integer> inputList = new ArrayList<>();
        ArrayList<Integer> exitList = new ArrayList<>();

        double sum = 0;
        for (int i = 0; i < inputString.length; i++) {
            inputList.add(Integer.parseInt(inputString[i]));
            sum = sum + 1.00 * inputList.get(i);
        }

        extractIntegersBiggerThanAverage(inputList, exitList, sum);

        if (exitList.size() == 1 || exitList.isEmpty()) {
            System.out.println("No");
        } else {
            Collections.sort(exitList);
            Collections.reverse(exitList);
            for (int i = 0; i < exitList.size(); i++) {
                if (i < 5) {
                    System.out.print(exitList.get(i) + " ");
                }
            }
        }
    }

    private static void extractIntegersBiggerThanAverage(ArrayList<Integer> inputList, ArrayList<Integer> exitList, double sum) {
        double average = 1.00 * sum / inputList.size();
        for (int i = 0; i < inputList.size(); i++) {
            if (average < 1.00 * inputList.get(i)) {
                exitList.add(inputList.get(i));
            }
        }
    }
}
