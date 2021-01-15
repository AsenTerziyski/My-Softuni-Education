import java.util.Scanner;

public class FL11CleverLilly {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLilly = Integer.parseInt(scanner.nextLine());
        double priceWashmachine = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double sumBrhtdays = 0;
        int countEvenBirthdays = 0;

        for (int i = 1; i <= ageLilly; i++) {

            if (i % 2 != 0) {
                countToys++;
            } else {
                countEvenBirthdays++;
                sumBrhtdays = sumBrhtdays + countEvenBirthdays * 10.00;
            }

        }

        double totalSumToys = 1.00 * countToys * pricePerToy;
        double totalSumSaved = sumBrhtdays - countEvenBirthdays * 1.00;
        double totalSum = totalSumSaved + totalSumToys;
        double diff = Math.abs(1.00 * priceWashmachine - totalSum);

        if (priceWashmachine <= totalSum) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
