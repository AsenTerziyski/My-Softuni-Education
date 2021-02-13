import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Q02HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First Second Third Fourth Fifth Sixth Seventh
        // 3
        String[] children = scanner.nextLine().split("\\s+");
        int n = Integer.valueOf(scanner.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (String child : children) {
            queue.offer(child);
        }

        while (queue.size()>1) {
            for (int i = 0; i <n; i++) {
                String currentChild = queue.poll();
                queue.offer(currentChild);
            }
            System.out.println("Removed " + queue.poll());
        }
        System.out.println("Last is: " + queue.poll());
    }
}
