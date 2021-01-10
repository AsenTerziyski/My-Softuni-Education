import java.util.Scanner;

public class FL07SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int sumNumber = 0;

        for (i = 1; i <= n; i++) {
            int enterNum = Integer.parseInt(scanner.nextLine());
            sumNumber = sumNumber + enterNum;
        }

        System.out.println(sumNumber);
    }
}
