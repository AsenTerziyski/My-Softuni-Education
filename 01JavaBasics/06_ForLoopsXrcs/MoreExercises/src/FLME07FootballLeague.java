import java.util.Scanner;

public class FLME07FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int stadiumCount = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());

        int sumA = 0;
        int sumB = 0;
        int sumV = 0;
        int sumG = 0;

        for (int i = 1; i <= numberOfFans; i++) {

            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    sumA++;
                    break;

                case "B":
                    sumB++;
                    break;

                case "V":
                    sumV++;
                    break;
                case "G":
                    sumG++;
                    break;

            }

        }

        double percentA = 100.00 * sumA / numberOfFans;
        double percentB = 100.00 * sumB / numberOfFans;
        double percentV = 100.00 * sumV / numberOfFans;
        double percentG = 100.00 * sumG / numberOfFans;
        double percentTotal = 0.00;
        // if (numberOfFans <= stadiumCount) {
        percentTotal = 100.00 * numberOfFans / stadiumCount;
        // }
        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentTotal);

    }
}
