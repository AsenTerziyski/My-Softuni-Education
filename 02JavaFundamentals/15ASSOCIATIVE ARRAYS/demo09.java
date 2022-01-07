import java.util.*;
import java.util.stream.Collectors;

public class demo09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        List<String> inputList = Arrays.stream(input).collect(Collectors.toList());

        //putka|putka|putka|hui|hui|cici|cici|cici|cici|cici|guz|putka|putka|putka

        Map<String, Integer> probaMap = new LinkedHashMap<>();
        for (int i = 0; i <inputList.size(); i++) {
            String current = inputList.get(i);
            probaMap.putIfAbsent(current, 0);
            if (probaMap.containsKey(current)) {
                int count = probaMap.get(current) + 1;
                probaMap.put(current, count);
            }
        }

        probaMap
                .entrySet()
                .stream()
                .sorted((f,s)->{
            int result = 1;
            if (f.getValue() < s.getValue()) {
                result = -1;
                return result;
            } else {
                result = f.getKey().compareTo(s.getKey());
            }
            return result;
        })
                .forEach(s-> System.out.println(String.format("%s = > %d", s.getKey(), s.getValue())));
    }
}
