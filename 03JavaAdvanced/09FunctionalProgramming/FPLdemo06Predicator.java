import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class FPLdemo06Predicator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = List.of(1, 2, 3, 5);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        //System.out.println(isEven.test(6));
        //System.out.println(isEven.test(7));

        numbers
                .stream()
                .filter(isEven)
                .map(n -> n * 10)
                .forEach(n -> System.out.println(n));
        //20


    }
}
