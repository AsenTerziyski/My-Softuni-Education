import java.util.Scanner;

public class e07ToyShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 1. Правя си вход за цената на екскурзията:
        double priceExcursion = Double.parseDouble(scanner.nextLine());

        // 2. Вход за броя на играчките:
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberBears = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        // 3. Изчисляваме сумата в лв. на всички играчки:
        double totalSum = numberPuzzles * 2.60 + numberDolls * 3.00 + numberBears * 4.10 + numberMinions * 8.20 + numberTrucks * 2.00;

        // 4. Определям общия брой на играчките:
        int totalNumberOfToys = numberPuzzles + numberDolls + numberBears + numberMinions + numberTrucks;

        // 5. Правя променлива, в която да сметна чистата сума след приспадане на 25%:
        double totalSumNet = totalSum - totalSum * 0.25;

        // 6. Правя променлива, в която да сметна колко ми остава след приспадане на наема. Тази променлива ще
        // сравнявам с цената на екскурзията:
        double revenue = 0.00;

        // 7. Правя си иф проверка за боря на играчките:
        if (totalNumberOfToys >= 50) {
            // 7.1 Ако броят им е по голям или равен на 50 имаме отстъпка 25% => totalSumNet
            revenue = totalSumNet - totalSumNet * 0.10;
        } else {
            // 7.2 иначе => тоталСум:
            revenue = totalSum - totalSum * 0.10;
        }

        // 8. Правя си втора иф проверка за сравняване на revenue със priceExcursion:
        if (revenue >= priceExcursion) {
            // 8.1 Разликата между двете променливи може да е отрицателно число, ето защо
            // при принтиране ползвам Math.abs:
            System.out.printf("Yes! %.2f", Math.abs(revenue - priceExcursion));
            System.out.print(" lv left.");

        } else {
            System.out.printf("Not enough money! %.2f", Math.abs(priceExcursion - revenue));
            System.out.print(" lv needed.");
        }

    }
}
