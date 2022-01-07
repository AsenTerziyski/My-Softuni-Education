import java.util.Arrays;
import java.util.Scanner;

public class demo14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\|");
        //words = Arrays.stream(words).map(w -> w + "xxx").toArray(String[]::new);
        words = Arrays.stream(words).filter(w-> w.length()%2==0).toArray(String[]::new);

        System.out.println(String.join("/", words));
    }
}
