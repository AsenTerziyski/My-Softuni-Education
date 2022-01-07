import java.sql.SQLOutput;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Z02MinorTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resourses = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            resourses.putIfAbsent(resource, 0);
            //int newQuantity = resourses.get(resource) + quantity;
            //resourses.put(resource, newQuantity);
            resourses.put(resource, resourses.get(resource) + quantity);

            resource = scanner.nextLine();
        }

        for (Map.Entry<String, Integer> entry : resourses.entrySet()) {
            System.out.println(String.format("%s -> %d", entry.getKey(), entry.getValue()));
        }

        //sledvat razlichni primeri za printirane:
//        for (Map.Entry<String, Integer> entry : resourses.entrySet()) {
//            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
//        }

//        //може и така да се принтира:
//        resourses
//                .forEach((k, v) -> System.out.println(String.format("%s -> %d", k, v)));
//
//        // или така:
//        resourses
//                .entrySet()
//                .stream()
//                .forEach(e -> System.out.println(String.format("%s -> %d", e.getKey(), e.getValue())));
    }
}
