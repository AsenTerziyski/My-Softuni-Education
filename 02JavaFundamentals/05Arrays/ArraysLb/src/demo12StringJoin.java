import java.util.Scanner;

public class demo12StringJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frstName = scanner.nextLine();
        String scndName = scanner.nextLine();
        String famillyName = scanner.nextLine();

        String[] inputStrings = {frstName, scndName, famillyName};

        // мога да си направя Стринг, който да събран от масив от стрингове!
        String outputString = String.join("@", inputStrings);
        System.out.println(outputString);
    }
}
