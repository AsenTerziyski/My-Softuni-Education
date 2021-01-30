import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

public class FPLdemo04Consumer {
    public static void main(String[] args) {
        //demo Consumer:
        // Consumer е променлива
        List<Integer> numbersTwo = List.of(1, 2, 3, -7, 5, 4, 15, -2, 0);
        //int order = 1; -> еко е просто инт, няма да се номерира. Трябва да стане масив с един елемент:
        int[] order = {1};
        Consumer<Integer> printer = num -> System.out.println((order[0]++) + ". -> " + num);
        numbersTwo
                .stream()
                .forEach(printer);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        // за да избегна правенето на масив, в Джава този проблем е решен с AtomicInteger:
        AtomicInteger orderSecond = new AtomicInteger(0);
        Consumer<Integer> printerTwo = num -> System.out.println(orderSecond.incrementAndGet() + ". => " + (num + 10));
        numbersTwo
                .stream()
                .forEach(printerTwo);

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        ArrayDeque<Integer> numsThree = new ArrayDeque<>();
        //numbersTwo.stream().forEach(numsThree::push);
        numbersTwo.stream().forEach(n-> numsThree.push(n*100));
        for (Integer integer : numsThree) {
            System.out.println(integer);
        }
    }
}
