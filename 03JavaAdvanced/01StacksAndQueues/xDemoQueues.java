import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Scanner;

public class xDemoQueues {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String[] input = scanner.nextLine().split("\\s+");
        String [] input = new String[] {"0", "1", "2", "3", "4", "5", "6", "7"};
        ArrayDeque<Integer> numbersQueue = new ArrayDeque<>();
        for (int i = 0; i <input.length; i++) {
            numbersQueue.offer(Integer.parseInt(input[i]));
        }
        System.out.println();
        System.out.println(numbersQueue.pollFirst());
        System.out.println(numbersQueue.pollLast());
        System.out.println(numbersQueue.peek());
        int[] ints = numbersQueue.stream().mapToInt(Integer::intValue).toArray();
        for (int anInt : ints) {
            System.out.println("!" + anInt + "!");
        }
    }
}
