import java.math.BigInteger;
import java.util.Scanner;

public class OC03BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        BigInteger f = new BigInteger(String.valueOf(1));
        BigInteger proba = new BigInteger(String.valueOf(10));
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(Integer.parseInt(String.valueOf(i))));
        }
        System.out.println(f);
        System.out.println(proba);
        System.out.println(proba.multiply(f));
    }
}
