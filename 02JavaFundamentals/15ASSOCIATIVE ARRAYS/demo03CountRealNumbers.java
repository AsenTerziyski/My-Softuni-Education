import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class demo03CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Double, Integer> numberOccurences = new TreeMap<>();
        String[] inputDoubles = scanner.nextLine().split("\\s+");
        for (int i = 0; i < inputDoubles.length; i++) {
            double number = Double.parseDouble(inputDoubles[i]);
            Integer occurences = numberOccurences.get(number);
            numberOccurences.putIfAbsent(number, 0);
//            if (occurences == null) {
//                occurences = 0;
//            }
            numberOccurences.put(number, numberOccurences.get(number) + 1);
        }

//        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
//            //System.out.println(entry.getKey() + " -> " + entry.getValue());
//            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
//        }
//        for (Map.Entry<Double, Integer> entry : numberOccurences.entrySet()) {
//            System.out.println(String.format("%.2f -> %d", entry.getKey(), entry.getValue()));
//        }

        numberOccurences
                .entrySet()
                .stream()
                .sorted((a,b)-> b.getKey().compareTo(a.getKey()))
                .filter(s-> s.getKey()>=0)
                .forEach(s-> System.out.println(String.format("%.2f --- >>> %d", s.getKey(), s.getValue())));

    }
}
