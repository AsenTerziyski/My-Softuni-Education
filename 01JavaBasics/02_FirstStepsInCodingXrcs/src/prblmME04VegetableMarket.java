import java.util.Scanner;

public class prblmME04VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetable = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double totalSumLeva = priceVegetables * kgVegetable + priceFruits * kgFruits;
        double totalSumEvro = totalSumLeva / 1.94;

        System.out.printf("%.2f", totalSumEvro);

    }
}
