import java.util.Scanner;

public class x09SpiceMustFlowStarred {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startYield = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalNetExtracted = 0;

        while (startYield >=100) {
            totalNetExtracted = totalNetExtracted + startYield - 26;
            days = days + 1;
            startYield = startYield - 10;
        }

        if (totalNetExtracted > 26) {
            totalNetExtracted = totalNetExtracted - 26;
        }

        System.out.println(days);
        System.out.println(totalNetExtracted);

    }
}
