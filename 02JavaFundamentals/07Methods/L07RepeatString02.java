import java.util.Scanner;

public class L07RepeatString02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int countRepeat = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(inputString,countRepeat));
    }

    private static String repeatString(String inputString, int countRepeat) {
        // този начин е по-добър от конкатенация в цикъл! Виж лекция на около 2ч:55мин.
        String[] outputArray = new String[countRepeat];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = inputString;
        }
        String exitString = String.join("",outputArray);
        return exitString;
    }
}
