import java.util.Arrays;
import java.util.Scanner;

public class MDA04SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rowsAndColumns = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(rowsAndColumns[0]);
        int columns = Integer.parseInt(rowsAndColumns[1]);
        
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row <rows ; row++) {
            String[] inputRow = scanner.nextLine().split(", ");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = Integer.parseInt(inputRow[col]);
            }
        }

        int sum = 0;
        for (int row = 0; row <rows ; row++) {
            for (int col = 0; col <columns; col++) {
                int currentElement = matrix[row][col];
                sum = sum + currentElement;
            }
        }

        System.out.println(rows);
        System.out.println(columns);
        System.out.println(sum);
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
