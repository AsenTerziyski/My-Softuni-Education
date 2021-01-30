import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class FPLdemo03 {
    public static void main(String[] args) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int[] numbers = {1, 2, 3, -7, 5, 4, 15, -2, 0};
        //get first number greater than 3 and even and multiply it by two - 4*2 = 8
        int number = Arrays
                .stream(numbers)
                .filter(n -> n > 3)
                .filter(MathATT::isEven)
                .map(n -> n * 2)
                .findFirst()
                .getAsInt();

        System.out.println(number);
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        //with FOR-LOOP:
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 3 && numbers[i] % 2 == 0) {
                System.out.println(numbers[i] * 2);
                break;
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
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
