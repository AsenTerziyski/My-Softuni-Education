import java.util.Scanner;

public class EP01SoftUniReceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eff1 = Integer.parseInt(scanner.nextLine());
        int eff2 = Integer.parseInt(scanner.nextLine());
        int eff3 = Integer.parseInt(scanner.nextLine());

        int effTotal = eff1 + eff2 + eff3;
        int studentsRemaining = Integer.parseInt(scanner.nextLine());

        int hours = 0;
        while (studentsRemaining > 0) {
            hours++;
            if (hours % 4 != 0) {
                studentsRemaining = studentsRemaining - effTotal;
            }
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
