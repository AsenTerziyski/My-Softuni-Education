import java.util.Scanner;

public class FLME03Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLoads = Integer.parseInt(scanner.nextLine());

        int tonsMicroBus = 0;
        int tonsTruck = 0;
        int tonsTrain = 0;
        int tonsTotal = 0;

        for (int i = 1; i <= numberOfLoads; i++) {

            int tonsValues = Integer.parseInt(scanner.nextLine());
            tonsTotal = tonsTotal + tonsValues;

            if (tonsValues <= 3) {
                tonsMicroBus = tonsMicroBus + tonsValues;
            }

            if (tonsValues >= 4 && tonsValues <= 11) {
                tonsTruck = tonsTruck + tonsValues;
            }

            if (tonsValues >= 12) {
                tonsTrain = tonsTrain + tonsValues;
            }

        }

        double pMicroBus = 100.00 * tonsMicroBus / tonsTotal;
        double pTruck = 100.00 * tonsTruck / tonsTotal;
        double pTrain = 100.00 * tonsTrain / tonsTotal;
        double averagePrice = 1.00 * (tonsMicroBus * 200.00 + tonsTruck * 175.00 + tonsTrain * 120.00) / tonsTotal;

        System.out.printf("%.2f%n", averagePrice);
        System.out.printf("%.2f%%%n", pMicroBus);
        System.out.printf("%.2f%%%n", pTruck);
        System.out.printf("%.2f%%%n", pTrain);
    }
}
