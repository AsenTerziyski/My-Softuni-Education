import java.util.Scanner;

public class ME01PipesInPool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int pipeOneQ = Integer.parseInt(scanner.nextLine());
        int pipeTwoQ = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double pipeOneVolume = hours * pipeOneQ;
        double pipeTwoVolume = hours * pipeTwoQ;

        double pipeOnePercent = (100 * pipeOneVolume / (pipeOneVolume + pipeTwoVolume));
        double pipeTwoPercent = 100 * pipeTwoVolume / (pipeOneVolume + pipeTwoVolume);
        double totalPercent = 100 * (pipeOneVolume + pipeTwoVolume) / V;

        if ((pipeOneVolume + pipeTwoVolume) <= V) {
            System.out.printf("The pool is %.2f", totalPercent);
            System.out.print("% full.");
            System.out.printf(" Pipe 1: %.2f", pipeOnePercent);
            System.out.print("%.");
            System.out.printf(" Pipe 2: %.2f", pipeTwoPercent);
            System.out.print("%.");
        } else {
            double overFlow = pipeOneVolume + pipeTwoVolume - V;
            System.out.printf("For %.2f hours the pool overflows with ", hours);
            System.out.printf("%.2f liters.", overFlow);
        }
    }
}
