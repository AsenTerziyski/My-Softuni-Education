import java.util.*;
import java.util.stream.Collectors;

public class demo15FilterArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(scanner.nextLine()
                        .split("\\s+"))
                .mapToInt(s -> Integer.parseInt(s))
                .filter(n -> n > 100 && n < 1000)
                .sorted().toArray();


        for (int number : numbers) {
            System.out.println(number);
        }

        List<Integer> reversed = new ArrayList<>();
        for (int i = numbers.length-1; i >=0; i--) {
            reversed.add(numbers[i]);
        }

        //Collections.reverse(reversed);
        for (int i = 0; i <reversed.size(); i++) {
            if (i!=reversed.size()-1) {
                System.out.print(reversed.get(i) + " ");
            } else {
                System.out.print(reversed.get(i));
            }
        }
    }
}
