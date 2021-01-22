import java.util.Scanner;

public class MDA03DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int row = 0; row < n; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = Integer.parseInt(inputRow[col]);
                matrix[row][col] = currentNumber;
            }
        }

        int sumFirstDiagonal = 0;
        for (int rowCol = 0; rowCol < n; rowCol++) {
            int currentNumber = matrix[rowCol][rowCol];
            sumFirstDiagonal = sumFirstDiagonal + currentNumber;
        }

        int sumSecondDiagonal = 0;
        int row = n-1;
        for (int col = 0; col < n; col++) {
            int currentNumber = matrix[row][col];
            sumSecondDiagonal = sumSecondDiagonal + currentNumber;
            row--;

        }

        int diff = sumFirstDiagonal - sumSecondDiagonal;
        System.out.println(Math.abs(diff));

    }
}
