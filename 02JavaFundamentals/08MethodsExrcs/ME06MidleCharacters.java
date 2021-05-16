import java.util.Scanner;

public class ME06MidleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(middleCharacters(input));
    }

    private static String middleCharacters(String input) {
        String exit = "";
        if (input.length() % 2 == 0) {
            exit = exit + input.charAt(input.length() / 2 - 1) + input.charAt(input.length() / 2);
        } else {
            exit = exit + input.charAt(input.length() / 2);
        }
        return exit;
    }
}
