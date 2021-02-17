import java.util.Scanner;

public class Pr02Selling {
    static int startRow = 0;
    static int startCol = 0;
    static int money = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        char[][] matrix = new char[n][n];
//        int startRow = 0;
//        int startCol = 0;
        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
//            if (line.contains("S")) {
//                startRow = row;
//                startCol = line.indexOf('S');
//            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'S') {
                    startRow = row;
                    startCol = col;
                }
            }
        }

        //int money = 0;
        boolean isInBakery = true;
        while (money < 50 && isInBakery) {
            String command = scanner.nextLine();
            switch (command) {
                case "up":
                    //moveUp
                    isInBakery = move(startRow - 1, startCol, matrix);
                    break;
                case "down":
                    //moveDown
                    isInBakery = move(startRow + 1, startCol, matrix);
                    break;
                case "right":
                    //moveRight
                    isInBakery = move(startRow, startCol + 1, matrix);
                    break;
                case "left":
                    //moveLeft
                    isInBakery = move(startRow, startCol - 1, matrix);
                    break;
            }

        }

        String message = !isInBakery
                ? "Bad news, you are out of the bakery."
                : "Good news! You succeeded in collecting enough money!";
        System.out.println(message);
        System.out.println("Money: " + money);

        printMatrix(matrix);
    }

    private static boolean move(int newRow, int newCol, char[][] matrix) {

//        char symbol = matrix[startRow][startCol];
        matrix[startRow][startCol] = '-';

        if (isOutOfBounds(newRow, newCol, matrix)) {
            return false;
        }
        char symbol = matrix[newRow][newCol];
        if (Character.isDigit(symbol)) {
            money += symbol - '0';
        } else if (symbol == 'O') {
            matrix[newRow][newCol] = '-';
            int[] secondPillarLocation = findSecondPillar(matrix);
            newRow = secondPillarLocation[0];
            newCol = secondPillarLocation[1];
        }
        matrix[newRow][newCol] = 'S';
        startRow = newRow;
        startCol = newCol;
        return true;
    }

    public static int[] findSecondPillar(char[][] matrix) {
        int[] indexes = null;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'O') {
                    indexes = new int[]{row, col};
                    break;
                }
                if (indexes != null) {
                    break;
                }
            }
        }
        return indexes;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0 || col >= matrix[row].length || col < 0;
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
