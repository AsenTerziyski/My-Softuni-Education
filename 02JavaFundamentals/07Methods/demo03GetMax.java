import java.util.Scanner;

public class demo03GetMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        // getMaxOfTwo(firstNum, secondNum);
        System.out.println(getMaxOfTwo(firstNum, secondNum));
    }

    private static int getMaxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        }
        // Може без елсе,защото ретърн е като брейк. Т.е ако а > б, връща а и прекъсва изпълнението
        // на програмата.
        return b;
    }
}
