import java.util.Scanner;

public class ME11ExchangeArrayAfterIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArray = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        if (n > inputArray.length - 1 || n < 0) {
            System.out.println("Invalid index");
        } else {
            int[] exitArray = exchangeArrayAfterIndex(n, inputArray);
            for (int i : exitArray) {
                System.out.print(i + " ");
            }
        }
    }

    private static int[] exchangeArrayAfterIndex(int n, String[] inputArray) {
        int[] inputIntArray = new int[inputArray.length];
        for (int i = 0; i < inputIntArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputArray[i]);
        }
        int[] exitArray = new int[inputIntArray.length];
        int countTwo = 0;
        for (int i = 0; i <= n; i++) {
            exitArray[i] = inputIntArray[n +1 + countTwo];
            countTwo++;
        }
        int count = 0;
        for (int i = n+1; i < exitArray.length; i++) {
            exitArray[i] = inputIntArray[count];
            count++;
        }
        return exitArray;
    }
}
