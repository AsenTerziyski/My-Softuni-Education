import java.util.ArrayDeque;
import java.util.Scanner;

public class SQ04demoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackOfIntegers = new ArrayDeque<>();

        for (int i = 1; i <= 10; i++) {
            stackOfIntegers.push(i);
        }

        for (int i = 0; i <stackOfIntegers.size(); i++) {
            System.out.println(stackOfIntegers.peek());
        }

        while (!stackOfIntegers.isEmpty()) {
            System.out.println(stackOfIntegers.pop());
        }


    }
}
