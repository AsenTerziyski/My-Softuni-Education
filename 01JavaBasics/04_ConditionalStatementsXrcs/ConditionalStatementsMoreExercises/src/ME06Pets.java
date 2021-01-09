import java.util.Scanner;

public class ME06Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalFoodKg = Integer.parseInt(scanner.nextLine());

        double dogFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double catFoodPerDayKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodPerDayGr = Double.parseDouble(scanner.nextLine());

        double totalFoodKgConsumed = (dogFoodPerDayKg + catFoodPerDayKg + turtleFoodPerDayGr / 1000) * days;
        double diff = 0;

        if (totalFoodKgConsumed <= totalFoodKg) {
            diff = Math.floor(totalFoodKg - totalFoodKgConsumed);
            System.out.printf("%.0f kilos of food left.", diff);
        } else {
            diff = Math.ceil(totalFoodKgConsumed - totalFoodKg);
            System.out.printf("%.0f more kilos of food are needed. ", diff);
        }
    }
}

