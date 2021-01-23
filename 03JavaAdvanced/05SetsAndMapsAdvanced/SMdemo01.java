import java.util.HashSet;
import java.util.Scanner;

public class SMdemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        boolean exist = numbers.add(13);
        System.out.println(exist);

        numbers.add(73);
        numbers.add(0);
        numbers.add(69);
        numbers.add(13);

        exist = numbers.add(13);
        System.out.println(exist);
    }
}
