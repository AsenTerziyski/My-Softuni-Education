import java.util.Scanner;

public class EasterBakery_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        int numberEggsBoxes = Integer.parseInt(scanner.nextLine());
        int numberYeastBoxes = Integer.parseInt(scanner.nextLine());

        double priceSugar = 0.75 * priceFlour;
        double priceEggsBox = 1.10 * priceFlour;
        double priceYeastBox = 0.20 * priceSugar;

        double totalSum = priceFlour * kgFlour + priceEggsBox * numberEggsBoxes + priceYeastBox * numberYeastBoxes + priceSugar * kgSugar;
        System.out.printf("%.2f", totalSum);
    }
}
