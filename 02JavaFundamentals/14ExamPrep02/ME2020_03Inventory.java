import java.util.ArrayList;
import java.util.Scanner;

public class ME2020_03Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputItems = scanner.nextLine().split(", ");
        ArrayList<String> inventory = new ArrayList<>();
        for (int i = 0; i < inputItems.length; i++) {
            inventory.add(inputItems[i]);
        }

        String commandLine = scanner.nextLine();
        while (!commandLine.equals("Craft!")) {
            String[] input = commandLine.split(" - ");
            String currentCommand = input[0];
            String item = input[1];
            switch (currentCommand) {
                case "Collect":
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] oldNewItems = item.split(":");
                    String oldItem = oldNewItems[0];
                    String newItem = oldNewItems[1];
                    if (inventory.contains(oldItem)) {
                        int index = inventory.indexOf(oldItem);
                        inventory.add(index+1, newItem);
                    }
//                    int indexOldItem = -1;
//                    for (int i = 0; i < inventory.size(); i++) {
//                        if (inventory.contains(oldItem)) {
//                            indexOldItem = i;
//                        }
//                    }
//                    if (indexOldItem != -1) {
//                        inventory.add(indexOldItem + 1, newItem);
//                    }
                    break;
                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
            }


            commandLine = scanner.nextLine();
        }
        printStringArrayList(inventory);
    }

    private static void printStringArrayList(ArrayList<String> inventory) {
        for (int i = 0; i < inventory.size(); i++) {
            if (i == inventory.size() - 1) {
                System.out.print(inventory.get(i));
            } else {
                System.out.print(inventory.get(i) + ", ");
            }
        }
    }
}
