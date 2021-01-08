import java.util.Scanner;

public class x05PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        printPartASCIITable(start, end);

    }

    private static void printPartASCIITable(int start, int end) {
        char startCh = (char) start;
        char endCh = (char) end;
        if (start < end) {
            for (int i = startCh; i <= endCh; i++) {
                char currentCh = (char) i;
                System.out.print(currentCh + " ");
            }
        } else {
            for (int i = startCh; i >= endCh; i--) {
                char currentCh = (char) i;
                System.out.print(currentCh + " ");
            }
        }
    }
}
