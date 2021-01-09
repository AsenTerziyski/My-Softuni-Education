import java.util.Scanner;

public class arrExrc10LAdyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] field = new int[n];

        String[] bugIndexes = scanner.nextLine().split(" ");
        for (int i = 0; i < bugIndexes.length; i++) {
            int bugIndex = Integer.parseInt(bugIndexes[i]);
            if (bugIndex >= 0 && bugIndex < field.length) {
                field[bugIndex] = 1;
            }
        }

        String line = scanner.nextLine();
        while (!line.equals("end")) {
            String[] commands = line.split(" ");
            int bugIndex = Integer.parseInt(commands[0]);
            String direction = commands[1];
            int lengthOfFLight = Integer.parseInt(commands[2]);

            if (bugIndex < 0 || bugIndex >= field.length || field[bugIndex] != 1) {
                line = scanner.nextLine();
                continue;
            }
            // kalinkata izlita i oovobovdawa myastoto si:
            field[bugIndex] = 0;
            // posoka na poleta:
            if (direction.equals("right")) {
                bugIndex = bugIndex + lengthOfFLight;
                // flight
                while (bugIndex < field.length && field[bugIndex] == 1) {
                    bugIndex = bugIndex + lengthOfFLight;
                }

                if (bugIndex < field.length) {
                    field[bugIndex] = 1;
                }

            } else if (direction.equals("left")) {
                bugIndex = bugIndex - lengthOfFLight;
                //flight left
                while (bugIndex - lengthOfFLight >= 0 && field[bugIndex] == 1) {
                    bugIndex = bugIndex - lengthOfFLight;
                }

                if (bugIndex >= 0) {
                    field[bugIndex] = 1;
                }
            }

            line = scanner.nextLine();
        }

        for (int i = 0; i < field.length; i++) {
            System.out.print(field[i] + " ");
        }
    }
}
