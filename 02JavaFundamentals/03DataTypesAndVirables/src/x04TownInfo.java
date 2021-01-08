import java.util.Scanner;

public class x04TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOfTown = scanner.nextLine();
        String population = scanner.nextLine();
        String area = scanner.nextLine();

        printTownInfo(nameOfTown,population, area);

    }

    private static void printTownInfo(String town, String pop, String area) {
        String exitString = String.format("Town %s has population of %s and area %s square km.", town, pop, area);
        System.out.print(exitString);
    }
}
