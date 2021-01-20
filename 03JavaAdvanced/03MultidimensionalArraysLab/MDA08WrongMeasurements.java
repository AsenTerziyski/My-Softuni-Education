import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MDA08WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] inputRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[n][inputRow.length];
        int i = 0;
        for (int row = 0; row < n; row++) {

            for (int col = 0; col < inputRow.length; col++) {
                matrix[row][col] = (inputRow[col]);
            }

            i++;
            if (i == n) {
                break;
            }

            inputRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }


        String stringIndexes = scanner.nextLine();
        String[] stringIndexesArr = stringIndexes.split("\\s+");
        int wrongRow = Integer.parseInt(stringIndexesArr[0]);
        int wrongCol = Integer.parseInt(stringIndexesArr[1]);
        int wrongValue = matrix[wrongRow][wrongCol];

        ArrayList<int[]> fixInfo = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == wrongValue) {
                    int rightValue = calculateRightValue(matrix, row, col, wrongValue);
                    fixInfo.add(new int[]{row, col, rightValue});
                }
            }
        }

        for (int[] info : fixInfo) {
            matrix[info[0]][info[1]] = info[2];
        }

        printMatrix(matrix);
    }

    private static int calculateRightValue(int[][] matrix, int row, int col, int wrongValue) {
        int rightValue = 0;
        //up+down+left+right
        if (isInBound(matrix, row - 1, col) && matrix[row - 1][col] != wrongValue) {
            rightValue += matrix[row - 1][col];
        }
        if (isInBound(matrix, row + 1, col) && matrix[row + 1][col] != wrongValue) {
            rightValue += matrix[row + 1][col];
        }
        if (isInBound(matrix, row, col - 1) && matrix[row][col - 1] != wrongValue) {
            rightValue += matrix[row][col - 1];
        }
        if (isInBound(matrix, row, col + 1) && matrix[row][col + 1] != wrongValue) {
            rightValue += matrix[row][col + 1];
        }
        return rightValue;
    }

    private static boolean isInBound(int[][] matrix, int row, int col) {
        return row < matrix.length && row >= 0 && col < matrix[row].length && col >= 0;
    }

    private static int[][] readMatrix(Scanner scanner, int n) {
        int[] inputRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[][] matrix = new int[n][inputRow.length];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < inputRow.length; col++) {
                matrix[row][col] = (inputRow[col]);
            }
            inputRow = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
