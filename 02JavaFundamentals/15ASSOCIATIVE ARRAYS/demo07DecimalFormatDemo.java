import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;

public class demo07DecimalFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(n -> Double.parseDouble(n)).toArray();

        Map<Double, Integer> numbersMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            double currentNumber = numbers[i];
            if (!numbersMap.containsKey(currentNumber)) {
                numbersMap.put(currentNumber, 0);
            }

            numbersMap.put(currentNumber, numbersMap.get(currentNumber) + 1);
        }

        numbersMap
                .entrySet()
                .stream()
                .sorted((f, s) -> f.getKey().compareTo(s.getKey()))
                .forEach(n -> System.out.println(String.format("%.0f -> %d", n.getKey(), n.getValue())));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            // казва с колко да се закръгли след точката - броят на #:
            DecimalFormat df = new DecimalFormat("#.####");
            System.out.println(String.format("%s => %d", df.format(entry.getKey()), entry.getValue()));
        }
        //2.555559 3.1 1 100
        //1 -> 1
        //3 -> 1
        //3 -> 1
        //100 -> 1
        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        //1 => 1
        //3,1 => 1
        //2,5556 => 1
        //100 => 1
    }
}
