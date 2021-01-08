import java.util.Scanner;

public class x02PoundsDollarsCorrect {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cents = Integer.parseInt(scanner.nextLine());
        double convertedCents = cents * 1.31000;
        int wholeDollars = (int) convertedCents / 100;
        int wholeCents = (int) convertedCents % 100;
        System.out.printf("%02d.%02d", wholeDollars, wholeCents);
    }
}
