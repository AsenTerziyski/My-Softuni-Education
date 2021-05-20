import java.util.ArrayList;
import java.util.Scanner;

public class L11DemoShootTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // left*0*5;
        // right*1*4
        //0 10 20 30 40 50 60 70 80 90
        // left*0*5;
        // right*1*4
        // left*0*15
        // right*10*25
        //right*5*20
        //left*7*25
        //end
        String[] inputArray = scanner.nextLine().split(" ");
        ArrayList<Integer> targets = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            targets.add(Integer.parseInt(inputArray[i]));
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArray = command.split("\\*");
            String direction = commandArray[0];
            int index = Integer.parseInt(commandArray[1]);
            int length = Integer.parseInt(commandArray[2]);
            int targetIndex = 0;
            switch (direction) {
                case "left":
                    if (index >= 0 && index <= targets.size() - 1) {
                        if (index - length < 0) {
                            targetIndex = index - length + targets.size();
                            while (targetIndex < 0) {
                                targetIndex = targetIndex + targets.size();
                            }
                        } else {
                            targetIndex = index - length;
                        }
                        targets.set(targetIndex, targets.get(targetIndex) - 5);

                    }
                    break;
                case "right":
                    if (index >= 0 && index <= targets.size() - 1) {
                        if (index + length > targets.size() - 1) {
                            targetIndex = index + length - targets.size();
                            while (targetIndex > targets.size()) {
                                targetIndex = targetIndex - targets.size();
                            }
                        } else {
                            targetIndex = index + length;
                        }
                        targets.set(targetIndex, targets.get(targetIndex) - 5);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < targets.size(); i++) {
            if (i == targets.size() - 1) {
                System.out.print(targets.get(i));
            } else {
                System.out.print(targets.get(i) + " ");
            }
        }
    }
}
