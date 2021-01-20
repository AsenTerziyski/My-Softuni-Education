import java.util.Scanner;

public class MDAdemo03ReadMAtrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] inputRowAsString = scanner.nextLine().split("\\s+");
        int[][] matrix = new int[n][inputRowAsString.length];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < inputRowAsString.length; col++) {
                int currNumber = Integer.parseInt(inputRowAsString[col]);
                matrix[row][col] = currNumber;
            }
            inputRowAsString = scanner.nextLine().split("\\s+");

        }

    }
}
