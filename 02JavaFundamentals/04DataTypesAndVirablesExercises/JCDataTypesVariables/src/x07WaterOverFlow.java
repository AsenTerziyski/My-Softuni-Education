import java.util.Scanner;

public class x07WaterOverFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int volumeFilled = 0;

        for (int i = 1; i <= n; i++) {
            int littersOfWater = Integer.parseInt(scanner.nextLine());
            volumeFilled = volumeFilled + littersOfWater;

            if (volumeFilled > 255) {
                System.out.printf("Insufficient capacity!%n");
                volumeFilled = volumeFilled - littersOfWater;
            }

        }

        System.out.println(volumeFilled);
    }
}
