import java.util.Scanner;

public class demo01Chapter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chapterNumber = Integer.parseInt(sc.nextLine());
        String chapterName = sc.nextLine();
        char symbol = sc.nextLine().charAt(0);
        printHeader(chapterNumber, chapterName, symbol);
    }

    private static void printHeader(int n, String chapterName, char symbol) {
        printSymbol(symbol, chapterName);
        System.out.println();
        System.out.println(chapterName + "" + n);
        printSymbol(symbol, chapterName);
    }

    private static void printSymbol(char symbol, String chapterName) {
        for (int i = 0; i < chapterName.length(); i++) {
            System.out.print(symbol);
            //System.out.println();
        }
    }
}
