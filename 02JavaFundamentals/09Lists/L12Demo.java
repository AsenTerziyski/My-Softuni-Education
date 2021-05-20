import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L12Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbs = new ArrayList<>(Arrays.asList(10, 20, 30, 40));
        numbs.add(50);
        numbs.remove(2);
        numbs.remove(Integer.valueOf(30));
        numbs.add(60);
        numbs.add(70);
        numbs.add(70);
        numbs.add(950);
        numbs.add(80);
        numbs.set(3,1000);
        for (int i = 0; i <numbs.size(); i++) {
            if (numbs.get(i) == 70) {
                numbs.set(i, 1001);
            }
        }

        List<Integer> numbs2 = numbs.stream()
                .filter(n -> n >= 60)
                .limit(5)
                .sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        numbs2.forEach(n -> System.out.print(String.format(n + "/")));
    }
}
