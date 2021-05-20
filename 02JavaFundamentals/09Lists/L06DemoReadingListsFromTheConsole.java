import java.util.ArrayList;
import java.util.Scanner;

public class L06DemoReadingListsFromTheConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String inputDemo = scanner.nextLine();
        String[] input = scanner.nextLine().split("\\s+");
//        ArrayList<Integer> demoInteger = new ArrayList<>();
//        for (int i = 0; i <input.length; i++) {
//            demoInteger.add(Integer.parseInt(input[i]));
//        }
        ArrayList<Double> demoDouble = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            demoDouble.add(Double.parseDouble(input[i]));
        }

        for (int i = 0; i < demoDouble.size(); i++) {
            if (demoDouble.get(i) <= 0) {
                demoDouble.remove(i);
            }
        }

        for (int i = 0; i < demoDouble.size(); i++) {
            if (demoDouble.get(i) == demoDouble.get(demoDouble.size() - 1)) {
                System.out.print(demoDouble.get(demoDouble.size() - 1));
            } else {
                System.out.print(demoDouble.get(i) + "\\");
            }

        }
    }
}
