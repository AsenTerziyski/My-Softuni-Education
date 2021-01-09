import java.util.Scanner;

public class demo07ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int rotations = Integer.parseInt(scanner.nextLine());

        rotateStringArray(input, rotations);
        printStringArray(input);

    }

    private static void printStringArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            if (i == input.length - 1) {
                System.out.print(input[i]);
            } else {
                System.out.print(input[i] + " ");
            }
        }
    }

    private static void rotateStringArray(String[] input, int rotations) {
        for (int i = 0; i < rotations; i++) {
            String tempEllementAtZeroIndex = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = tempEllementAtZeroIndex;
        }
    }

}
