import java.util.Scanner;

public class ME09TankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double finalSum = 0.00;
        double finalSum2 = 0.00;

        if (clubCard.equals("Yes")) {
            if (typeOfFuel.equals("Gasoline")) {
                finalSum = fuel * (2.22 - 0.18);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            } else if (typeOfFuel.equals("Diesel")) {
                finalSum = fuel * (2.33 - 0.12);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            } else if (typeOfFuel.equals("Gas")) {
                finalSum = fuel * (0.93 - 0.08);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            }
        } else if (clubCard.equals("No")) {
            if (typeOfFuel.equals("Gasoline")) {
                finalSum = fuel * (2.22);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            } else if (typeOfFuel.equals("Diesel")) {
                finalSum = fuel * (2.33);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            } else if (typeOfFuel.equals("Gas")) {
                finalSum = fuel * (0.93);
                if (fuel > 20 && fuel <= 25) {
                    finalSum2 = finalSum - 0.08 * finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                } else if (fuel > 25) {
                    finalSum2 = finalSum - finalSum * 0.1;
                    System.out.printf("%.2f lv.", finalSum2);
                } else {
                    finalSum2 = finalSum;
                    System.out.printf("%.2f lv.", finalSum2);
                }
            }
        }
    }
}
