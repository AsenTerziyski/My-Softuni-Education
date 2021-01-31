import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Scanner;
import java.util.function.Consumer;

public class FP01ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Consumer<String> names = (String name) -> System.out.println(name);
//        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(names);
        Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .forEach(System.out::println);

    }
}
