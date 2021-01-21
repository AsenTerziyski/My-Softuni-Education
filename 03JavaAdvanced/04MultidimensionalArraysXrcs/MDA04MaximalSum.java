import java.util.Arrays;
import java.util.Scanner;

public class MDA04MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nXm = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(num -> Integer.parseInt(num))
                .toArray();
//        for (int row = 0; row < n; row++) {
//            String[] inputRow = scanner.nextLine().split("\\s+");
//            for (int col = 0; col < m; col++) {
//                int currentNumber = Integer.parseInt(inputRow[col]);
//                matrix[row][col] = currentNumber;
//            }

        int n = nXm[0];
        int m = nXm[1];
        int[][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = Arrays
                    .stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(element -> Integer.parseInt(element))
                    .toArray();
        }

        int[] bestVector = new int[2];
        int bestSum = Integer.MIN_VALUE;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int[] start = new int[]{row, col};
                if (findSum(start, matrix) > bestSum) {
                    bestSum = findSum(start, matrix);
                    bestVector = start;
                }
            }
        }
        System.out.println(String.format("Sum = %d", bestSum));
        printMatrix(bestVector, matrix);
    }

    private static int findSum(int[] vector, int[][] matrix) {
        int sum = 0;
        for (int row = vector[0]; row < vector[0] + 3; row++) {
            for (int col = vector[1]; col < vector[1] + 3; col++) {
                sum = sum + matrix[row][col];
            }
        }
        return sum;
    }

    /**
     * printsSubMatrix
     *
     * @param vector
     * @param matrix
     */

    private static void printMatrix(int[] vector, int[][] matrix) {
        for (int row = vector[0]; row < vector[0] + 3; row++) {
            for (int col = vector[1]; col < vector[1] + 3; col++) {
                System.out.print(String.format("%d ", matrix[row][col]));
            }
            System.out.println();
        }
    }
}

