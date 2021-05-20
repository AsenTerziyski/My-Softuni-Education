import java.util.*;

public class L11DemoAddAlldemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> proba1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> proba2 = new ArrayList<>(Arrays.asList(4, -5, 0));
        proba1.addAll(3, proba2);
        Collections.reverse(proba2);
        System.out.println(proba1.toString().replaceAll("[\\[\\],]", ""));
    }
}
