import java.util.Scanner;

public class demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(58.58 % 10);
        double euro = Double.parseDouble(scanner.nextLine());
        //double bgn = Integer.parseInt(scanner.nextLine());

        double euroCents = euro * 100;
        double bgnCents = euroCents * 1.9558;

        int bgnLv = (int) (bgnCents / 100);
        int bgnLeftCents = (int) bgnCents %100;
        System.out.printf("%d.%d000", bgnLv, bgnLeftCents);

    }
}
