import java.util.Scanner;

public class demo15ForeachPokazno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        String[] inputStringArray = inputText.split(" ");
        int[] numbersArray = new int[inputStringArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(inputStringArray[i]);
        }

        int sumOdd = 0;
        int sumEven = 0;
        for (int numb : numbersArray) {
            if (numb % 2 == 0) {
                sumEven = sumEven + numb;
            } else {
                sumOdd = sumOdd + numb;
            }
        }

        int diff = sumEven - sumOdd;
        System.out.println(diff);
    }
}
