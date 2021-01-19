import java.util.Scanner;

public class MDA05MaximumSumOf2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner, ", ");
        int maxSum = 0;
        int maxRow = 0;
        int maxCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length-1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }

        System.out.println(matrix[maxRow][maxCol] + " " + matrix[maxRow][maxCol + 1]);
        System.out.println(matrix[maxRow + 1][maxCol] + " " + matrix[maxRow + 1][maxCol + 1]);
        System.out.println(maxSum);

    }

    private static int[][] readMatrix(Scanner scanner, String pattern) {
        String[] rowsAndColumns = scanner.nextLine().split(pattern);
        int rows = Integer.parseInt(rowsAndColumns[0]);
        int columns = Integer.parseInt(rowsAndColumns[1]);

        int[][] matrix = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] currentRow = scanner.nextLine().split(pattern);
            for (int col = 0; col < columns; col++) {
                int currentNumber = Integer.parseInt(currentRow[col]);
                matrix[row][col] = currentNumber;
            }
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
