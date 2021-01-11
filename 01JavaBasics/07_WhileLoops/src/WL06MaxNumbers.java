import java.util.Scanner;

public class WL06MaxNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine();
        int maxNumber = Integer.MIN_VALUE;

        while (!inputValue.equals("Stop")) {

            int inputNumber = Integer.parseInt(inputValue);

            if (maxNumber < inputNumber) {
                maxNumber = inputNumber;
            }

            inputValue = scanner.nextLine();
        }

        System.out.println(maxNumber);

    }
}
