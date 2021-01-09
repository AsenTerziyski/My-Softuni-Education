import java.util.Scanner;

public class demo19CondenseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int[] parsedArray = new int[input.length];
        for (int i = 0; i < parsedArray.length; i++) {
            parsedArray[i] = Integer.parseInt(input[i]);
        }

        while (parsedArray.length > 1) {
            int[] condensed = new int[parsedArray.length-1];
            for (int i = 0; i <parsedArray.length-1; i++) {
                condensed[i] = parsedArray[i] + parsedArray[i+1];
            }
            parsedArray = condensed;
        }
        System.out.println(parsedArray[0]);
    }
}
