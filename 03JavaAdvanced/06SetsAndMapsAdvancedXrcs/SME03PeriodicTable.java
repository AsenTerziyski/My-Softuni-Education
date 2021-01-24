import java.util.Scanner;
import java.util.TreeSet;

public class SME03PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<String> periodicTable = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] currentInput = scanner.nextLine().split("\\s+");
            for (int j = 0; j < currentInput.length; j++) {
                periodicTable.add(currentInput[j]);
            }
        }

        for (String element : periodicTable) {
            System.out.print(element + " ");
        }
    }
}
