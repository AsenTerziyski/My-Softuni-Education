import java.util.ArrayList;
import java.util.Scanner;

public class demo03ProcessingCollections {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split("\\s+");

        ArrayList<Integer> inputCollection = new ArrayList<>();
        for (int i = 0; i <inputString.length; i++) {
            inputCollection.add(Integer.parseInt(inputString[i]));
        }

        int minValue = inputCollection.stream().mapToInt(Integer::intValue).min().getAsInt();
        System.out.println(minValue);

        minValue = inputCollection.stream().min(Integer::compareTo).get();
        System.out.println(minValue);

        double average = inputCollection.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(String.format("%.3f", average));
    }
}
