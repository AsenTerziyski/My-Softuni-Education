import java.util.*;

public class L04DemoSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Asaen0", "Aben01", "Acen002", "Aden0003"));
        // Collections.sort(names, (a, b) -> Integer.compare(a.length(), b.length()));
        Collections.reverse(names);
        System.out.println(names);
        Collections.sort(names, (a, b) -> Integer.compare(a.charAt(1), b.charAt(1)));

    }
}
