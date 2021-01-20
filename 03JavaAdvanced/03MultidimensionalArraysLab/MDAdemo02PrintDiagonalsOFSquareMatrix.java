import java.util.Scanner;

public class MDAdemo02PrintDiagonalsOFSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readSquareMatrix(scanner, n);

        int row = 0;
        int col = n - 1;

        while (row < n) {

            int innerRow = row;
            int innerCol = col;

            while (innerRow < n && innerCol < n) {
                System.out.print(matrix[innerRow++][innerCol++] + " ");
            }

            System.out.println();
            col--;

            if (col < 0) {
                col = 0;
                row++;
            }

        }

    }

    private static int[][] readSquareMatrix(Scanner scanner, int n) {
        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < inputRow.length; col++) {
                int currentNumber = Integer.parseInt(inputRow[col]);
                matrix[row][col] = currentNumber;
            }
        }

        return matrix;
    }
}
