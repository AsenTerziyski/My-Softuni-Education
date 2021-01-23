import java.util.HashSet;
import java.util.Scanner;

public class SMdemo02HashCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> names = new HashSet<>();
        String name = "George";
        int n = name.hashCode();
        System.out.println(n);

        name = "MalmSuite";
        n = name.hashCode();
        System.out.println(n);

    }
}
