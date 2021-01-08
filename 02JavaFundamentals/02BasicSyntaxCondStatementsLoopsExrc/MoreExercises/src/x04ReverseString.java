import java.util.Scanner;

public class x04ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String reversedString = "";
        for (int i =inputString.length()-1; i >=0; i--) {
            char currentLetter = inputString.charAt(i);
            reversedString = reversedString + currentLetter;
        }
        System.out.println(reversedString);
    }
}
