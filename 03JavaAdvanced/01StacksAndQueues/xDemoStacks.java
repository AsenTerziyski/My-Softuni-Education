import java.util.ArrayDeque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class xDemoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> demoIntegers = new ArrayDeque<>();
        for (int i = 1; i <= 10; i++) {
            demoIntegers.push(i);
        }

        demoIntegers.stream().filter(integer -> integer > 5).forEach(System.out::println);
        List<Integer> collect = demoIntegers.stream().filter(integer -> integer > 5).collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for (Integer integer : collect) {
            sb.append(integer + ", ");
        }
        System.out.println(sb.substring(0, sb.length() - 2));

        Integer pop = demoIntegers.pop();
        System.out.println(pop);
        Integer peek = demoIntegers.peek();
        System.out.println(peek);
        peek = demoIntegers.pop();
        System.out.println(peek);
        peek = demoIntegers.pop();
        System.out.println(peek);

        if (demoIntegers.isEmpty()) {
            throw new IllegalArgumentException("kissMyAss");
        } else {
            System.out.println(demoIntegers.size());
        }

        if (demoIntegers.contains(3)) {
            throw new IllegalArgumentException("!!!!!3");
        }



    }
}
