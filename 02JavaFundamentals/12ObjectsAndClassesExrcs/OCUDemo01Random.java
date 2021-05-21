import java.util.Random;
import java.util.Scanner;

public class OCUDemo01Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upper = Integer.parseInt(scanner.nextLine());
        int lower = Integer.parseInt(scanner.nextLine());
        Random rnd = new Random();
        int randomNumberUpper = rnd.nextInt(upper);
        int randomNumberLower = rnd.nextInt(lower);
        System.out.println(randomNumberUpper);
        System.out.println(randomNumberLower);
    }
}
