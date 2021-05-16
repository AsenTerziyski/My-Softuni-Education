import java.util.Scanner;

public class ME08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        double result = 1.00 * factorial(x) / factorial(y);
        System.out.printf("%.2f",result);
    }

    private static long factorial(int x) {
        // уловката е да е лонг. С интеджер Джъдж дава 70/100
        long factorial = 1;
        if (x>1) {
            for (int i = 1; i <=x; i++) {
                factorial = factorial * i;
            }
        } else if (x==1 || x==0) {
            factorial = 1;
        }
        return factorial;
    }
}
