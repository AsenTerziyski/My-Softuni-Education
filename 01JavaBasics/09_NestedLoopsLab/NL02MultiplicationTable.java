import java.util.Scanner;

public class NL02MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = 0;
        int numTwo = 0;
        int result = 0;
        for (numOne = 1; numOne <=10; numOne++) {

            for (numTwo = 1; numTwo <=10; numTwo++) {
                result = numOne * numTwo;
                System.out.printf("%d * %d = %d%n", numOne, numTwo, result);
            }

        }
    }
}
