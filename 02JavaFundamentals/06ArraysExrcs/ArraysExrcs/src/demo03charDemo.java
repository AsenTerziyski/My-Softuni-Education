import java.util.Scanner;

public class demo03charDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            System.out.println(letter);

            int letterValue = (int) letter;
//            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//            System.out.println(letterValue);
            sum = sum + letterValue;
        }
        System.out.printf("SumOfWord = %d", sum);
    }
}
