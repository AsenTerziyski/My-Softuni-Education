import java.util.Scanner;

public class ME03Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double kgGrape = x * y;
        double kgGrapeForWine = kgGrape * 0.40;
        double wineLiters = kgGrapeForWine / 2.5;

        double difference = 0.00;

        if (wineLiters < z) {
            difference = Math.floor(z - wineLiters);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", difference);
        } else {
            difference = Math.ceil(wineLiters - z);
            double wineLitersRoundedCeil = Math.floor(wineLiters);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.", wineLitersRoundedCeil);
            System.out.println();
            System.out.printf("%.0f liters left ->", difference);
            double winePerPerson = Math.ceil(difference / workers);
            System.out.printf(" %.0f liters per person.", winePerPerson);
        }
    }
}
