import java.util.Scanner;

public class prblmME08WatherForecastPart02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dgrs = Double.parseDouble(scanner.nextLine());

        if (dgrs >= 5.00 && dgrs <= 11.90) {
            System.out.println("Cold");
        } else if (dgrs >= 12.00 && dgrs <= 14.90) {
            System.out.println("Cool");
        } else if (dgrs >= 15.00 && dgrs <= 20.00) {
            System.out.println("Mild");
        } else if (dgrs >= 20.10 && dgrs <= 25.90) {
            System.out.println("Warm");
        } else if (dgrs >= 26.00 && dgrs <= 35.00) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }
    }
}
