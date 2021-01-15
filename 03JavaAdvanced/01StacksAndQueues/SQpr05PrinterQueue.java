import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class SQpr05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        while (!"print".equals(command)) {

            if (command.equals("cancel")) {
                String fileName = printQueue.poll();

                if (fileName != null) {
                    System.out.println("Canceled " + fileName);
                } else {
                    System.out.println("Printer is on standby");
                }

            } else {
                printQueue.offer(command);
            }

            command = scanner.nextLine();
        }
//        for (String fileName : printQueue) {
//            System.out.println(fileName);
//        }

//        while (!printQueue.isEmpty()) {
//            System.out.println(printQueue.poll());
//        }

        Arrays.stream(printQueue.toArray()).forEach(s-> System.out.println(s));

    }
}
