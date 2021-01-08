import java.util.Scanner;

public class x04ReversedStringWithMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String outputString = reversedString(inputString);
        System.out.println(outputString);
    }

    private static String reversedString(String inptStrng) {
        String rvrsdStrng = "";
        for (int i = inptStrng.length() - 1; i >= 0; i--) {
            rvrsdStrng = rvrsdStrng + inptStrng.charAt(i);
        }
        return rvrsdStrng;
    }
}
