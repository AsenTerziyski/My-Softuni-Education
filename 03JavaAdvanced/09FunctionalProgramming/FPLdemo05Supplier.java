import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;

public class FPLdemo05Supplier {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 5, 19, 7, 31, 9, 13, 100);


        Supplier<Integer> supp = () -> new Random().nextInt(150);

        Optional<Integer> nIntFindFirst = numbers
                .stream()
                .filter(n -> n > 3)
                .filter(MathATT::isEven)
                .map(n -> n * 2)
                .findFirst();

        int nInt = numbers
                .stream()
                .filter(n -> n > 3)
                .filter(MathATT::isEven)
                .map(n -> n * 2)
                .findFirst()
                .orElseGet(() -> new Random().nextInt(130));

        int nInt3 = numbers
                .stream()
                .filter(n -> n > 7)
                .findFirst()
                .orElseGet(supp);

        int nInt2 = numbers
                .stream()
                .filter(n -> n > 5)
                .findFirst().orElse(supp.get());


        System.out.println(nIntFindFirst);
        System.out.println(nInt);
        System.out.println(nInt2);
        System.out.println(nInt3);
    }
}
