import java.util.Scanner;

public class x10PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceBtwnPoketTargetsM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int currentPowerN = pokePowerN;
        int countTargets = 0;

        while (currentPowerN >= distanceBtwnPoketTargetsM) {
            currentPowerN = currentPowerN - distanceBtwnPoketTargetsM;
            countTargets = countTargets + 1;

            double percents = (100.00*currentPowerN / pokePowerN);

            if ((percents == 50.00) && exhaustionFactorY != 0) {
                currentPowerN = currentPowerN / exhaustionFactorY;
            }

        }

        System.out.println(currentPowerN);
        System.out.println(countTargets);

    }
}
