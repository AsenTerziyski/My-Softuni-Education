import java.util.Scanner;

public class L07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(inputString,countRepeat));
    }

    private static String repeatString(String inputString, int countRepeat) {
        String output = "";
        for (int i = 0; i < countRepeat; i++) {
            output = output + inputString;
        }
        return output;
        //System.out.println(output);
    }
}
