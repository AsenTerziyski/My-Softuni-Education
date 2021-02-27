package Pr04HotelReservation;
//import IOUtils.ConsoleReader;
//import IOUtils.InputParser;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runHoliday(scanner);
    }

    private static void runHoliday(Scanner scanner) {
        //ConsoleReader reader = new ConsoleReader();
        //String input = reader.readLine();
        //String[] tokens = InputParser.parseArray(input);
        String [] tokens = scanner.nextLine().split("\\s+");
        double discount = Double.parseDouble(tokens[0]);
        int days = Integer.parseInt(tokens[1]);
        Season season = Season.valueOf(tokens[2].toUpperCase());
        DiscountType discountType = DiscountType.valueOf(tokens[3].toUpperCase());
        PriceCalculator calculator = new PriceCalculator(discount, days, season,discountType);
        System.out.println(String.format("%.2f", calculator.calculate()));
    }
}
