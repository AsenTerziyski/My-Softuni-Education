import java.util.Scanner;

public class x07WaterOverFlowSecondTry {
    public static <tankCapacity> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        final int tankCapacity = 255;
        int filledVolume = 0;

        for (int i = 1; i <= n; i++) {

            int currentLitters = Integer.parseInt(scanner.nextLine());

            if (currentLitters + filledVolume > tankCapacity) {
                System.out.println("Insufficient capacity!");
                // continue;
            } else {
                filledVolume = filledVolume + currentLitters;
            }

        }

        System.out.println(filledVolume);
    }
}
