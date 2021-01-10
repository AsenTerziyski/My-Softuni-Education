import java.util.Scanner;

public class FL05CharSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int i = 0;

        for (i = 0; i < inputText.length(); i = i + 1) {
            char letter = inputText.charAt(i);
            System.out.println(letter);
        }

    }
}
