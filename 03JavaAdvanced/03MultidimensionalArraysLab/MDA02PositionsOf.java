import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MDA02PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = readArray(scanner);

        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            for (int i = 0; i < tokens.length; i++) {
                int number = Integer.parseInt(tokens[i]);
                matrix[row][i] = number;
            }
        }
        //printMatrix(matrix);
        int number = Integer.parseInt(scanner.nextLine());
        ArrayList<int[]> positions = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {

                if (number == matrix[row][col]) {
//                    int[] indexes = new int[2];
//                    indexes[0] = row;
//                    indexes[1] = col;
// може да се инициализира и по този начин:
                    int[] indexes = new int[]{row, col};
                    positions.add(indexes);
                }

            }

        }

        if (positions.isEmpty()) {
            System.out.println("not found");
        } else {
            for (int[] position : positions) {
                System.out.println(position[0] + " " + position[1]);
            }
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
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
