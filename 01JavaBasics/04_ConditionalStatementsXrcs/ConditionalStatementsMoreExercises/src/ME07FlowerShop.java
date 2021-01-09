import java.util.Scanner;

public class ME07FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nMagnolia = Integer.parseInt(scanner.nextLine());
        int nHyacinth = Integer.parseInt(scanner.nextLine());
        int nRose = Integer.parseInt(scanner.nextLine());
        int nCactus = Integer.parseInt(scanner.nextLine());

        double presentPrice = Double.parseDouble(scanner.nextLine());

        double totalSum = nMagnolia * 3.25 + nHyacinth * 4.00 + nRose * 3.50 + nCactus * 8.00;
        double totalSumWithoutTaxes = totalSum - 0.05 * totalSum;

        double diff = Math.abs(presentPrice - totalSumWithoutTaxes);
        double diffRounded = 0;

        if (totalSumWithoutTaxes >= presentPrice) {
            diffRounded = Math.floor(diff);
            System.out.printf("She is left with %.0f leva.", diffRounded);
        } else {
            diffRounded = Math.ceil(diff);
            System.out.printf("She will have to borrow %.0f leva.", diffRounded);
        }
    }
}
