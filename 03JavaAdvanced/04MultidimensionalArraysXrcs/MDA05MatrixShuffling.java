import java.util.Arrays;
import java.util.Scanner;

public class MDA05MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int[] input = Arrays
//                .stream(scanner.nextLine()
//                        .split("\\s+"))
//                .mapToInt(element -> Integer.parseInt(element))
//                .toArray();
        String[] inputSize = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(inputSize[0]);
        int m = Integer.parseInt(inputSize[1]);

        String[][] matrix = new String[n][m];
        for (int row = 0; row < n; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < m; col++) {
                String currentElement = inputRow[col];
                matrix[row][col] = currentElement;
            }
        }
//        for (int row = 0; row < n; row++) {
//            matrix[row] = Arrays
//                    .stream(scanner.nextLine()
//                            .split("\\s+"))
//                    .mapToInt(el -> Integer.parseInt(el))
//                    .toArray();
//        }
        String inputCommand = scanner.nextLine();
        while (!"END".equals(inputCommand)) {
            String[] data = inputCommand.split("\\s+");

            if (data.length !=5 || !data[0].equals("swap")) {
                System.out.println("Invalid input!");
            } else {
                //first number
                int row1 = Integer.parseInt(data[1]);
                int col1 = Integer.parseInt(data[2]);
                //second number
                int row2 = Integer.parseInt(data[3]);
                int col2 = Integer.parseInt(data[4]);
                if (!isValid(row1, row2, matrix) || !isValid(row2, col2, matrix)) {
                    System.out.println("Invalid input!");
                } else {
                    swapElement(row1,col1, row2, col2, matrix);
                    printMatrix(matrix);
                }
            }

            inputCommand = scanner.nextLine();
        }
    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(String.format(matrix[row][col] + " "));
            }
            System.out.println();
        }
    }

    private static void swapElement(int row1, int col1, int row2, int col2, String[][] matrix) {
            String tempElement = matrix[row2][col2];
            matrix[row2][col2] = matrix[row1][col1];
            matrix[row1][col1] = tempElement;
    }

    private static boolean isValid(int row, int col, String[][] matrix) {
        if (row >= 0 && row < matrix.length) {
            if (col >= 0 && col < matrix[row].length) {
                return true;
            }
        }
        return false;
    }
}
