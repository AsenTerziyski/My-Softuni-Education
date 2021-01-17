import java.util.ArrayDeque;
import java.util.Scanner;

public class SQexrcs08SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfOperations = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> memoryStack = new ArrayDeque<>();

        for (int i = 0; i < numbersOfOperations; i++) {

            String[] tokens = scanner.nextLine().split("\\s+");
            String argument = "";

            if (tokens.length > 1) {
                argument = tokens[1];
            }

            switch (tokens[0]) {

                case "1":
                    memoryStack.push(text.toString());
                    text.append(argument);
                    break;

                case "2":
                    memoryStack.push(text.toString());
                    int count = Integer.parseInt(argument);
                    int start = text.length() - count;
                    text.delete(start, start + count);
                    break;

                case "3":
                    int index = Integer.parseInt(argument);
                    System.out.println(text.charAt(index-1));
                    break;

                case "4":
                    //undo operation
                    if (!memoryStack.isEmpty()) {
                       text = new StringBuilder(memoryStack.pop());
                    }

                    break;
            }

        }

    }
}
