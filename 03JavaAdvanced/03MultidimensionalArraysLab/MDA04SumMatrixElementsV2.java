import java.util.Arrays;
import java.util.Scanner;

public class MDA04SumMatrixElementsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");

        int sum = 0;
        sum = getSum(matrix, sum);
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(sum);

//        // втори начин за сумиране на елементи на матрица:
//        int sumSecondV = Arrays
//                .stream(matrix)
//                .mapToInt(arr -> Arrays
//                        .stream(arr)
//                        .sum())
//                .sum();
//        System.out.println(sumSecondV);
    }

    private static int getSum(int[][] matrix, int sum) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                int currentElement = matrix[row][col];
                sum = sum + currentElement;
            }
        }
        return sum;
    }

    private static int[][] readMatrix(Scanner scanner, String pattern) {
        String[] rowsAndColumns = scanner.nextLine().split(pattern);
        int rows = Integer.parseInt(rowsAndColumns[0]);
        int columns = Integer.parseInt(rowsAndColumns[1]);
        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split(pattern);
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = Integer.parseInt(inputRow[col]);
            }
        }
        return matrix;
    }


}
