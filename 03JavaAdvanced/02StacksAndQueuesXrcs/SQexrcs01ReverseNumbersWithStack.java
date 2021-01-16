import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SQexrcs01ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");


        //List<Integer> numbs = Arrays.stream(input).map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<String> numbers = new ArrayDeque<>();

//        ArrayDeque<Integer> numbersInteger = new ArrayDeque<>();
//        Arrays.stream(input).map(Integer::parseInt).forEach(n->numbersInteger.push(n));

        for (int i = 0; i < input.length; i++) {
            numbers.push(input[i]);
        }

        //Object[] array = numbers.toArray();

        // will print without space after last number:
        while (numbers.size() > 1) {
            System.out.print(numbers.pop() + " ");
        }
        if (numbers.size() == 1) {
            System.out.print(numbers.pop());
        }

//        // will print with space after last number:
//        while (!numbers.isEmpty()) {
//            System.out.print(numbers.pop() + " ");
//        }

    }
}
