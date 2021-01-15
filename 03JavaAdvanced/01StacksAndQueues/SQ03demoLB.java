import java.util.ArrayDeque;
import java.util.Scanner;

public class SQ03demoLB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stackOfNumbers = new ArrayDeque<>();
        // push(T)
        // T pop()
        // T peek()

        stackOfNumbers.push(13);
        stackOfNumbers.push(42);
        System.out.println(stackOfNumbers.peek());
        stackOfNumbers.pop();
        System.out.println(stackOfNumbers.peek());
    }
}
