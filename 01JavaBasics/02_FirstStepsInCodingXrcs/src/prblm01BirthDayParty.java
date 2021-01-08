import java.util.Scanner;

public class prblm01BirthDayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rentRoom = Integer.parseInt(scanner.nextLine());

        double priceCake = 20 * rentRoom / 100;
        double priceDrinks = priceCake - 45 * priceCake / 100;
        double priceAnimator = rentRoom / 3;

        double totalSum = priceCake + priceDrinks + priceAnimator + rentRoom;
        System.out.print(totalSum);
    }
}
