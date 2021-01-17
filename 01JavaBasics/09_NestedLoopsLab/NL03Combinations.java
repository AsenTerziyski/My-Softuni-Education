import java.util.Scanner;

public class NL03Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int countValidCombination = 0;

        for (x1 = 0; x1 <= n; x1++) {

            for (x2 = 0; x2 <= n; x2++) {

                for (x3 = 0; x3 <= n; x3++) {

                    if (x1 + x2 + x3 == n) {
                        countValidCombination++;
                    }

                }

            }

        }

        System.out.println(countValidCombination);

    }
}
