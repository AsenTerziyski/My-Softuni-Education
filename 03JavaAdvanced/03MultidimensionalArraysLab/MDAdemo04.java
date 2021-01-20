import java.util.Scanner;

public class MDAdemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stringIndexes = scanner.nextLine();
        String[] stringIndexesArr = stringIndexes.split("\\s+");
        int wrongRow = Integer.parseInt(stringIndexesArr[0]);
        int wrongCol = Integer.parseInt(stringIndexesArr[1]);

        System.out.println(wrongRow);
        System.out.println(wrongCol);
    }
}
