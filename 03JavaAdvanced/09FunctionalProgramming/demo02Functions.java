import java.util.Scanner;
import java.util.function.Function;

public class demo02Functions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Function<Integer, Double> circleArea = r -> Math.PI * Math.pow(r,2);

        double area = circleArea.apply(2);
        System.out.println(String.format("%.2fm2", area));

        Function <Integer, Double> squareArea = a-> a*a*1.00;
        System.out.println(String.format("%.2fm2",squareArea.apply(2)));
    }
}
