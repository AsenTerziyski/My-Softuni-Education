import java.util.Scanner;

public class MDA01FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");
        int size = Integer.parseInt(tokens[0]);
        String fillPattern = tokens[1];

        int[][] matrix = fillMatrix(size, fillPattern);

        // за да видя какво прави този метод давам
        // ctrl + Q
        printMatrix(matrix);
    }

    private static int[][] fillMatrix(int n, String pattern) {
        int[][] matrix = new int[n][n];
        switch (pattern) {
            case "A":
                fillPatternA(matrix);
                break;
            case "B":
                fillPatternB(matrix);
                break;
        }
        return matrix;
    }

    private static void fillPatternB(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = number;
                    number++;
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[j][i] = number;
                    number++;
                }
            }
        }
    }

    private static void fillPatternA(int[][] matrix) {
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = number;
                number++;
            }
        }
    }

    /**
     * printsMatrix
     * Asen Terziyski
     * @param matrix
     */

    private static void printMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int element : ints) {
                System.out.print(String.format("%d ", element));
            }
            System.out.println();
        }
    }
}
