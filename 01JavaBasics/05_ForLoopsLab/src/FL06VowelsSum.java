import java.util.Scanner;

public class FL06VowelsSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        int i = 0;
        int sumTotal = 0;

        for (i = 0; i < inputText.length(); i++) {

            char symbol = inputText.charAt(i);

            switch (symbol) {
                case 'a':
                    sumTotal = sumTotal + 1;
                    break;
                case 'e':
                    sumTotal = sumTotal + 2;
                    break;
                case 'i':
                    sumTotal = sumTotal + 3;
                    break;
                case 'o':
                    sumTotal = sumTotal + 4;
                    break;
                case 'u':
                    sumTotal = sumTotal + 5;
                    break;
            }

        }
        System.out.println(sumTotal);

    }
}
