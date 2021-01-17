import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SQexrcs05Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> robots = Arrays.stream(scanner.nextLine().split(";")).collect(Collectors.toList());
        String[] names = new String[robots.size()];
        int[] processTime = new int[robots.size()];

        for (int i = 0; i < robots.size(); i++) {
            String[] tokens = robots.get(i).split("-");
            String name = tokens[0];
            names[i] = name;
            int time = Integer.parseInt(tokens[1]);
            processTime[i] = time;
        }

        String startTime = scanner.nextLine();

        ArrayDeque<String> productQueue = new ArrayDeque<>();

        String inputProduct = scanner.nextLine();
        while (!inputProduct.equals("End")) {
            productQueue.offer(inputProduct);

            inputProduct = scanner.nextLine();
        }

        String[] timeData = startTime.split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);

        // convert time in seconds:
        int startTimeInSeconds = hours * 3600 + minutes * 60 + seconds;

        int[] robotsWorkLeft = new int[robots.size()];

        while (!productQueue.isEmpty()) {
            // robots should take products if they are available
            startTimeInSeconds++;
            String product = productQueue.poll();
            int index = -1;

            for (int i = 0; i < robotsWorkLeft.length; i++) {

                if (robotsWorkLeft[i] > 0) {
                    robotsWorkLeft[i]--;
                }

                if (robotsWorkLeft[i] == 0 && index == -1) {
                    index = i;
                }

            }

            if (index != -1) {
                robotsWorkLeft[index] = processTime[index];
                System.out.println(printRobotData(names[index], product, startTimeInSeconds));
            } else {
                // index = -1 => all robots are busy
                productQueue.offer(product);
            }

        }

    }

    private static String printRobotData(String robot, String product, int beginTime) {
        long sec = beginTime % 60;
        long min = (beginTime / 60) % 60;
        long hours = (beginTime / (60 * 60)) % 24;
        String time = String.format("%02d:%02d:%02d", hours, min, sec);

        return String.format("%s - %s [%s]", robot, product, time);
    }
}
