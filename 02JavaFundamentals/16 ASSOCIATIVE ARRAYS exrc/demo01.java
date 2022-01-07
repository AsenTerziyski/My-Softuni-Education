import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> test = new HashMap<>();
        test.put("Petar", 45);
        test.put("Petar", 49);
        test.put("Asen", 42);
        test.put("Xxxx", 42);
        test.put("Asenx", 45);
        test.put("Asenxz", 43);
        test.putIfAbsent("Asen", 20);
        test.put("Boyan", 42);
        test.put("Ivan", 47);
        test.putIfAbsent("Petar", 100);
        test.putIfAbsent("Dinko", 10);

        test.entrySet().stream().sorted((first, second) -> {
            if (first.getKey().length() <= second.getKey().length()) {
                int firstValue = first.getValue();
                int secondValue = second.getValue();
                return secondValue - firstValue;
            }
            return first.getKey().compareTo(second.getKey());
        }).forEach(s -> System.out.println(String.format("name: %s --- > age %d", s.getKey(), s.getValue())));

//        for (Map.Entry<String, Integer> entry : test.entrySet()) {
//            System.out.printf("%s - > %d%n", entry.getKey(), entry.getValue());
//        }

        for (Map.Entry<String, Integer> entry : test.entrySet()) {
            System.out.print(String.format("%s / %d", entry.getKey(), entry.getValue()));
        }

    }
}
