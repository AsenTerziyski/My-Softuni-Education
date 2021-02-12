import java.util.ArrayDeque;
import java.util.Scanner;

public class SQ02BrHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> browser = new ArrayDeque<>();
        String line = scanner.nextLine();
        String current = "";
        while (!line.equals("Home")) {
            if (line.equals("back")) {
                if (browser.isEmpty()) {
                    current = browser.pop();
                } else {
                    System.out.println("no previous URLs");
                    line = scanner.nextLine();
                    continue;
                }
            } else {
                if (!line.equals("")) {
                    browser.push(line);
                    current = line;
                }
            }
            System.out.println(current);
            line = scanner.nextLine();
        }
    }
}
