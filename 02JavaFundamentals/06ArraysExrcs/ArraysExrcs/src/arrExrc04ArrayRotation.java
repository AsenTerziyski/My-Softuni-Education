import java.util.Scanner;

public class arrExrc04ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that receives an array
        // and number of rotations you have to perform
        // (first element goes at the end).
        // Print the resulting array.

        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String temp = input[0];
            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
