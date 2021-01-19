import java.util.Arrays;
import java.util.Scanner;

public class MDA01CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] firstMatrix = readMatrix(scanner);
        int[][] secondMatrix = readMatrix(scanner);

        boolean areNotEqual = firstMatrix.length != secondMatrix.length;

        if (!areNotEqual) {

            for (int row = 0; row < firstMatrix.length; row++) {
                int[] firstArr = firstMatrix[row];
                int[] secondArr = secondMatrix[row];
                areNotEqual = firstArr.length != secondArr.length;

                if (!areNotEqual) {

                    for (int col = 0; col < firstArr.length; col++) {
                        if (firstArr[col] != secondArr[col]) {
                            areNotEqual = true;
                            break;
                        }
                    }
                }

                if (areNotEqual) {
                    break;
                }

            }
        }

        String output = areNotEqual ? "not equal" : "equal";
        System.out.println(output);
    }

    private static int[][] readMatrix(Scanner scanner) {

        int[] rowsAndColumns = readArray(scanner);
        int row = rowsAndColumns[0];
        int col = rowsAndColumns[1];
        int[][] matrix = new int[row][col];

        for (int r = 0; r < row; r++) {
            matrix[r] = readArray(scanner);
        }

        return matrix;
    }

    private static void printMatrics(int[][] matrix) {

        // index work like that: first rows, then columns!

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix[rows].length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();

        }
//        for (int rows = 0; rows < matrix.length; rows++) {
//            int[] arr = matrix[rows];
//
//            for (int cols = 0; cols < arr.length; cols++) {
//                System.out.print(arr[cols] + " ");
//            }
//            System.out.println();
//        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
