import java.util.Scanner;

public class prblm09YardGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double areaForGreening = Double.parseDouble(scanner.nextLine());

        double totalSum = areaForGreening * 7.61;
        double discount = totalSum * 0.18;

        double finalSum = totalSum - discount;

        if (areaForGreening >= 0.00 && areaForGreening <= 100000.00)
            System.out.println("The final price is: " + finalSum + " lv.");

        System.out.print("Тhe discount is: " + discount + " lv.");


    }
}
