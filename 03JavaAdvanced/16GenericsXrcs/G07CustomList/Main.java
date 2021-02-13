package G07CustomList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList<String> customList = new CustomList<>();

        String input = scanner.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split("\\s+");

            String commands = tokens[0];
            switch (commands) {
                case "Add": {
                    String element = tokens[1];
                    customList.add(element);
                    break;
                }
                case "Remove": {
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                }
                case "Contains": {
                    String element = tokens[1];
                    System.out.println(customList.contains(element));
                    break;
                }
                case "Swap": {
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                }
                case "Greater": {
                    String element = tokens[1];
                    System.out.println(customList.countGreaterThan(element));
                    break;
                }
                case "Min": {
                    System.out.println(customList.getMin());
                    break;
                }
                case "Max": {
                    System.out.println(customList.getMax());
                    break;
                }
                case "Print": {
                    System.out.println(customList);
                    break;
                }
            }

            input = scanner.nextLine();
        }
    }
}
