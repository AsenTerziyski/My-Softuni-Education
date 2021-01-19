import java.util.Scanner;

public class MDAdemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = {
                {1, 2, 3, 4, 5},
                {6, 7, 8}
        };
        int element1 = matrix1[1][2];
        System.out.println(element1);

        int[][] matrix = new int[5][10];
        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = row + col;
            }

        }

        int element = matrix[0][1];
        System.out.println(element);
        int element2 = matrix[1][7];
        System.out.println(element2);
        System.out.println();

    }
}
