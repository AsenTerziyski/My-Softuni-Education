import java.util.Scanner;

public class arrExrc06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");

        int[] array = new int[inputArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        boolean isFound = false;
        for (int i = 0; i < array.length; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft = sumLeft + array[j];
            }

            for (int j = i + 1; j < array.length; j++) {
                sumRight = sumRight + array[j];
            }

            if (sumLeft == sumRight) {
                System.out.print(i);
                isFound = true;
            }

        }

        if (!isFound) {
            System.out.println("no");
        }

    }
}
