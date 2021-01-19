import java.util.Scanner;

public class MDA03IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][columns];
        char[][] secondMatrix = new char[rows][columns];

        firstMatrix = readMatrix(scanner, rows, columns);
        secondMatrix = readMatrix(scanner, rows, columns);

        char[][] thirdMatrix = new char[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {

                char firstSymbol = firstMatrix[row][col];
                char secondSymbol = secondMatrix[row][col];

                thirdMatrix[row][col] =
                        firstSymbol == secondSymbol
                                ? firstSymbol
                                : '*';
            }
        }

        printMatrics(thirdMatrix);
//        printMatrics(firstMatrix);
//        printMatrics(secondMatrix);

    }

    private static char[][] readMatrix(Scanner scanner, int rows, int columns) {
        char[][] matrix = new char[rows][columns];
        for (int row = 0; row < rows; row++) {
            String[] inputRow = scanner.nextLine().split("\\s+");
            for (int col = 0; col < columns; col++) {
                matrix[row][col] = inputRow[col].charAt(0);
            }
        }
        return matrix;
    }

    private static void printMatrics(char[][] matrix) {

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
