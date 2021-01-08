import java.util.Scanner;

public class demo04DigitExtractionFromTextAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Пример как да извадя от текст цифри и
        // да ги сумирам:
        // примерно a1nnnbc2kl2 => 1 + 2 + 2 = 5:
        String inpt = scanner.nextLine();
        int sum = 0;
        int currentNum = 0;
        for (int i = 0; i < inpt.length(); i++) {
            char current = inpt.charAt(i);
            if (Character.isDigit(current)) {
                System.out.print(current + " ");
                String strCurrNum = "" + current;
                currentNum = Integer.parseInt(strCurrNum);
            }
            sum = sum + currentNum;
            currentNum = 0;
        }
        System.out.println();
        // System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println(sum);
    }
}
