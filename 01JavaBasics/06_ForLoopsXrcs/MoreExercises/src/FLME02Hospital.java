import java.util.Scanner;

public class FLME02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int period = Integer.parseInt(scanner.nextLine());

        int medics = 7;
        int treated = 0;
        int untreated = 0;

        for (int i = 1; i <= period; i++) {

            int patientsPerDay = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && (untreated > treated)) {
                medics++;
            }

            if (patientsPerDay < medics) {
                int patientsTwo = patientsPerDay;
                treated = treated + patientsTwo;
            } else {
                treated = treated + medics;
            }

            if (patientsPerDay >= medics) {
                untreated = untreated + (patientsPerDay - medics);
            }

        }

        System.out.printf("Treated patients: %d.%n", treated);
        System.out.printf("Untreated patients: %d.", untreated);

    }
}
