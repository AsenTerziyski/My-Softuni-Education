import java.util.Scanner;
import java.util.function.Function;

public class FPLdemo02MyFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyFunction<Integer, Integer> myFunc = x -> x * x -10;
        System.out.println(myFunc.apply(7));

        Function<Integer, Integer> func = x -> x * 7;
        System.out.println(func.apply(10));

    }
}
