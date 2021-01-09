import java.util.Scanner;

public class CS04MetricConvertor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String enterMetricUnit = scanner.nextLine();
        String exitMetricUnit = scanner.nextLine();

        double result = 0;

        if (enterMetricUnit.equals("m")) {
            if (exitMetricUnit.equals("cm")) {
                result = num * 100;
            } else if (exitMetricUnit.equals("mm")) {
                result = num * 1000;
            }
        } else if (enterMetricUnit.equals("cm")) {
            if (exitMetricUnit.equals("m")) {
                result = num / 100;
            } else if (exitMetricUnit.equals("mm")) {
                result = num * 10;
            }
        } else if (enterMetricUnit.equals("mm")) {
            if (exitMetricUnit.equals("m")) {
                result = num / 1000;
            } else if (exitMetricUnit.equals("cm")) {
                result = num / 10;
            }
        }

        System.out.printf("%.3f", result);
    }
}
