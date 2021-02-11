package GenericsPrblm04ListUtilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 2, -1000, 2000, 500);
        Integer maxInteger = ListUtils.getMax(numbers);
        Integer minInteger = ListUtils.getMin(numbers);
        System.out.println(maxInteger);
        System.out.println(minInteger);

        List<Character> chars = new ArrayList<>();
        Collections.addAll(chars, 'a', 'b', 'c');
        System.out.println(ListUtils.getMax(chars));
        System.out.println(ListUtils.getMin(chars));
        // write your code here
    }
}
