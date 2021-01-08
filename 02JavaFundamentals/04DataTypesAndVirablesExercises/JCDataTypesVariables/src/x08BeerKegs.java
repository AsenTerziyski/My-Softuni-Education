import java.util.Scanner;

public class x08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double maxVolume = Integer.MIN_VALUE;
        String bestModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double rad = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * Math.pow(rad, 2.00) * height;

            if (maxVolume < volume) {
                maxVolume = volume;
                bestModel = model;
            }

        }

        System.out.println(bestModel);
    }
}
