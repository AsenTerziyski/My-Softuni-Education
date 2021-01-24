import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SME01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueUserNames = new LinkedHashSet<>();
        for (int i = 0; i <n; i++) {
            String currentName = scanner.next();
            uniqueUserNames.add(currentName);
        }

        for (String usrN : uniqueUserNames) {
            System.out.println(usrN);
        }
    }
}
