import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Stream;

public class demo06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Function<Double, Double> vat = price -> price * 1.20;

        double[] prices = Arrays
                .stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        System.out.println("Prices with VAT:");
        for (double price : prices) {
            System.out.println(String.format("%1$.2f", vat.apply(price)));
        }
    }


}
