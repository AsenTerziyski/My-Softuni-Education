import java.util.Scanner;

public class prblm02CharityCompaing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Входни данни:
        int daysCampagn = Integer.parseInt(scanner.nextLine());
        int numberShefs = Integer.parseInt(scanner.nextLine());
        int numberCakesPerShefPerDay = Integer.parseInt(scanner.nextLine());
        int numberGofretsPerShefPerDay = Integer.parseInt(scanner.nextLine());
        int numberPancakesPerShefPerDay = Integer.parseInt(scanner.nextLine());

        // 2. Изчисляване на общия брой на всяко изделие
        int totalNumberCakes = numberCakesPerShefPerDay * numberShefs * daysCampagn;
        int totalNumberGofrets = numberGofretsPerShefPerDay * numberShefs * daysCampagn;
        int totalNumberPancakes = numberPancakesPerShefPerDay * numberShefs * daysCampagn;

        // 3. Изичисляване на общите суми за всяко едно изделие:
        double totalSumCakes = totalNumberCakes * 45.00;
        double totalSumGofrets = totalNumberGofrets * 5.80;
        double totalSumPancakes = totalNumberPancakes * 3.20;

        // 4. Изчисляване на общата сума, преди приспадане на една осма:
        double totalSum = totalSumCakes + totalSumGofrets + totalSumPancakes;

        // 5. Изчисляване на нетната сума:
        double totalSumNet = totalSum - (totalSum / 8);

        // 6. Изход програма:
        System.out.printf("%.2f", totalSumNet);
    }
}
