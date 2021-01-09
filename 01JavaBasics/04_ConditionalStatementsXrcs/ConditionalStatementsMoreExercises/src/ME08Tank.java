import java.util.Scanner;

public class ME08Tank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFuel = scanner.nextLine();
        double fuelInRezervoar = Double.parseDouble(scanner.nextLine());

        if (typeOfFuel.equals("Diesel")) {
            if (fuelInRezervoar >= 25) {
                System.out.print("You have enough diesel.");
            } else {
                System.out.print("Fill your tank with diesel!");
            }
        } else if (typeOfFuel.equals("Gasoline")) {
            if (fuelInRezervoar >= 25) {
                System.out.print("You have enough gasoline.");
            } else {
                System.out.print("Fill your tank with gasoline!");
            }
        } else if (typeOfFuel.equals("Gas")) {
            if (fuelInRezervoar >= 25) {
                System.out.print("You have enough gas.");
            } else {
                System.out.print("Fill your tank with gas!");
            }
        } else {
            System.out.print("Invalid fuel!");
        }
    }
}
