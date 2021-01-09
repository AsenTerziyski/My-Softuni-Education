import java.util.Scanner;

public class CS06GodzilaVSKong {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double movieBudget = Double.parseDouble(scanner.nextLine());
        int numberStatists = Integer.parseInt(scanner.nextLine());
        double priceClothesPerStatist = Double.parseDouble(scanner.nextLine());

        double finalPriceClothesPerStatist = 0;
        double decor = 0.10 * movieBudget;

        if (numberStatists > 150) {
            finalPriceClothesPerStatist = priceClothesPerStatist - priceClothesPerStatist * 0.1;
        } else {
            finalPriceClothesPerStatist = priceClothesPerStatist;
        }

        double movieCost = finalPriceClothesPerStatist * numberStatists + decor;
        double moneyLeft = Math.abs(movieBudget - movieCost);

        if (movieCost > movieBudget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", moneyLeft);
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", moneyLeft);
        }

    }
}
