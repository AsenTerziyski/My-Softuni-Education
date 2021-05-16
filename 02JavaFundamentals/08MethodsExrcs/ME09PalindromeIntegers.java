import java.util.Scanner;

public class ME09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //isPalindrome(input);
        while (!input.equals("END")) {
            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isPalindrome(String input) {
        boolean palindrome = false;
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (reversed.equals(input)) {
            palindrome = true;
        }
        return palindrome;
    }
}


