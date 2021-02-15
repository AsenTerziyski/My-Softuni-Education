package IC04Froggy;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] stones = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        Lake lake = new Lake(stones);
        Iterator<Integer> frog = lake.iterator();
        StringBuilder sb = new StringBuilder();
        while (frog.hasNext()) {
            sb
                    .append(frog.next())
                    .append(", ");
        }
        String output = sb.substring(0, sb.length() - 2);
        System.out.println(output.trim());
        // write your code here
    }
}
