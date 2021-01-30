import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class FPL04AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // my solution:
//        DoubleStream doubleStream = Arrays
//                .stream(scanner.nextLine()
//                        .split(", "))
//                .mapToDouble(d -> Double.parseDouble(d))
//                .map(d -> d * 1.2);
//
//        System.out.println("Prices with VAT:");
//
//        doubleStream
//                .forEach
//                        (price ->
//                                {
//                                    System.out.println(String.format("%.2f", price));
//                                }
//                        );

        // other solution using unary operator:
        UnaryOperator<Double> addingVAT = vat-> vat*1.20;
        DoubleStream doubleStreamSecond = Arrays
                .stream(scanner.nextLine()
                        .split(", "))
                .mapToDouble(d-> Double.parseDouble(d))
                .map(d-> addingVAT.apply(d));

        System.out.println("Prices with VAT:");
        doubleStreamSecond
                .forEach(priceWithVAT-> System.out.println(String.format("%.2f", priceWithVAT)));

//        String values = Arrays.stream(scanner.nextLine().split(", ")).map(e->
//                String.format("%.2f", addingVAT.apply(Double.parseDouble(e)))).collect(Collectors.joining(System.lineSeparator()));
//        System.out.println(values);

    }
}
