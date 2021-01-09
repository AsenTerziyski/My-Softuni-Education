import java.lang.reflect.Array;
import java.util.Scanner;

public class demo01PraveneMasiv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        //създаване на масив - в случая е тип интеджер:
        int[] numbers = new int[n];

        // пълнене на масива примерно така:
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        int rezult = numbers[0] + numbers[2];
        System.out.println(rezult);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int proba = Array.getLength(numbers);

        int rezultTwo = numbers[0] + numbers[2];
        System.out.println(rezultTwo);
        numbers[2] = rezultTwo;

        int rezultThree = numbers[1] + numbers[2];
        System.out.println(rezultThree);
        //System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println(proba);

    }
}
