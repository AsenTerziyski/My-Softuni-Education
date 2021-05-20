import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class OC02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        BigInteger firstNumb = new BigInteger(scanner.nextLine());
//        BigInteger secondNumb = new BigInteger(scanner.nextLine());
//        BigInteger sum = firstNumb.add(secondNumb);
//        System.out.println(sum);
//
//        BigInteger thridNumber = new BigInteger(scanner.nextLine());
//        BigInteger forthNumber = new BigInteger(scanner.nextLine());
//        System.out.println(thridNumber.multiply(forthNumber));

        BigDecimal fifth = new BigDecimal(scanner.nextLine());
        BigDecimal sixth = new BigDecimal(scanner.nextLine());
        System.out.println(fifth.multiply(sixth));
        System.out.println(String.format("%.20f", fifth.multiply(sixth)));
    }
}
