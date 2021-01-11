import java.util.Scanner;

public class WL03SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = Integer.parseInt(scanner.nextLine());
        int sumInputNumbers = 0;

        while (sumInputNumbers < numberOne) {
            int numberInput = Integer.parseInt(scanner.nextLine());
            sumInputNumbers = sumInputNumbers + numberInput;
        }

        System.out.println(sumInputNumbers);
    }
}
