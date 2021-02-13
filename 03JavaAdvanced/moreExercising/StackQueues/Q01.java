import java.util.ArrayDeque;
import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> integerQueue = new ArrayDeque<>();
        integerQueue.offer(1);
        integerQueue.offer(2);
        integerQueue.offer(3);
        integerQueue.offer(4);
        integerQueue.offer(5);
        integerQueue.offer(6);
        integerQueue.offer(7);

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println("First number is:" + integerQueue.peek());

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        int num = 7;
        System.out.println("Queue contains: " + num + " -> " + integerQueue.contains(num));

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println("Size is:" + integerQueue.size());

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        for (Integer integer : integerQueue) {
            System.out.println(integerQueue.poll());
        }

        System.out.println("xxxxxxxxxxxxxxxxxxx");
        System.out.println("Size is:" + integerQueue.size());
    }
}
