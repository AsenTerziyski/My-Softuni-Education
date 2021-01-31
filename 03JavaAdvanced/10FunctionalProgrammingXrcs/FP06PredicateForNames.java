import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FP06PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> predicate = name -> name.length() <= n;
        Consumer<String> printName = name -> System.out.println(name);

        //Arrays.stream(names).filter(s->predicate.test(s)).forEach(s-> System.out.println(s));

        Arrays
                .stream(names)
                .filter(predicate::test)
                .forEach(printName::accept);

    }
}
