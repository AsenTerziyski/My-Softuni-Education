package G01GenericBox;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            //int input = Integer.parseInt(scanner.nextLine());
            Box<String> box = new Box<String>(input);
            System.out.println(box);
        }
        // write your code here
    }
}
