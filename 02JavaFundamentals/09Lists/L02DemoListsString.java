import java.util.ArrayList;
import java.util.Scanner;

public class L02DemoListsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        ArrayList<String> namesCollection = new ArrayList<>();
        while (!inputString.equals("Stop")) {
            namesCollection.add(inputString);
            inputString = scanner.nextLine();
        }
        for (String names : namesCollection) {
            System.out.print(names + ", ");
        }
        System.out.println();
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        namesCollection.remove("Lars");

        for (String names : namesCollection) {
            System.out.print(names + ", ");
        }
        System.out.println();
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        namesCollection.add(3, "Mitko");
        namesCollection.set(4, "Kiss");
        for (String names : namesCollection) {
            System.out.print(names + ", ");
        }
        System.out.println();
    }
}
