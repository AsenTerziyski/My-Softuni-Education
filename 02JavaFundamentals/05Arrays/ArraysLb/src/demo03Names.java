import java.util.Scanner;

public class demo03Names {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] names = new String[n];

        for (int i = 0; i < names.length; i++) {
            names[i] = scanner.nextLine();
        }
        System.out.println(names[0] + names[1] + names[2]);
    }
}
