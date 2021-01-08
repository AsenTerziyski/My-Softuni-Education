import java.util.Scanner;

public class x09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//The amount of money Ivan Cho has – floating-point number in range [0.00…1,000.00]
//The count of students – integer in range [0…100]
//he price of lightsabers for a single sabre – floating-point number in range [0.00…100.00]
//The price of robes for a single robe – floating-point number in range [0.00…100.00]

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceLightsabersForASingleSabre = Double.parseDouble(scanner.nextLine());
        double priceOfRobesForAsingleRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBeltsForAsingleBelt = Double.parseDouble(scanner.nextLine());

        int numLightsabers = (int) Math.ceil(1.10 * countOfStudents);
        double totalSum = 0;

        int numOfBelts = countOfStudents;

        for (int i = 1; i <= countOfStudents; i++) {
            if (i % 6 == 0) {
                numOfBelts--;
            }
        }
        totalSum = priceLightsabersForASingleSabre * numLightsabers + priceOfRobesForAsingleRobe * countOfStudents + numOfBelts * priceOfBeltsForAsingleBelt;
        if (totalSum > amountOfMoney) {
            System.out.printf("Ivan Cho will need %.2flv more.", totalSum - amountOfMoney);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }
    }
}
