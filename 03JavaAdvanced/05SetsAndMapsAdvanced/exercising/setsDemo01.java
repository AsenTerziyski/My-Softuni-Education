import java.util.*;

public class setsDemo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> stringSet = new HashSet<>();
        for (int i = 0; i <10; i++) {
            stringSet.add("i"+i);
        }
        System.out.println();
        int[] integers = new int[] {1, 2, 3, 4, 5};
        Set<Integer> integerSet = new HashSet<>();
        for (int i = 0; i <integers.length; i++) {
            integerSet.add(integers[i]);
        }
        System.out.println();
        System.out.println(integerSet.size());
        System.out.println(stringSet.isEmpty());
        if (stringSet.contains("i1")) {
            System.out.println("yessss");
        } else {
            boolean i100 = stringSet.contains("i100");
            if (i100 == true) {

            }
        }
    }
}
