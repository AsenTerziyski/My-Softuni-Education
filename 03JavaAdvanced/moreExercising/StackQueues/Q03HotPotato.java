import java.util.ArrayDeque;
import java.util.Scanner;

public class Q03HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split("\\s+");
        ArrayDeque<String> queue = new ArrayDeque<>();

        for (int i = 0; i < names.length; i++) {
            queue.offer(names[i]);
        }

        int n = Integer.parseInt(scanner.nextLine());
        int cycle = 1;
        while (queue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String currentChild = "";
                if (queue.isEmpty()) {
                    currentChild = "no such a child";
                    System.out.println(currentChild);
                } else {
                    currentChild = queue.poll();
                    queue.offer(currentChild);
                }
            }

            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            } else {
                String removed = queue.poll();
                System.out.println("Removed " + removed);
            }

            cycle++;
        }
        String last = queue.poll();
        System.out.println("Last is " + last);
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                return false;
            }

        }
        return true;

    }
}
