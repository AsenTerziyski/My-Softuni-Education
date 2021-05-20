import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class L05DemoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> demo = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7));
        int razmer = demo.size();
        demo.add(Integer.valueOf(109));
        demo.add(0, 100);
        demo.remove(1);
        demo.remove(Integer.valueOf(1));
        if (demo.contains(7)) {
            demo.remove(Integer.valueOf(7));
            demo.add(Integer.valueOf(107));
        }
        demo.add(Integer.valueOf(-105));
        demo.set(4, 104);

        for (int i = 0; i <demo.size(); i++) {
            if (demo.get(i) == demo.get(demo.size()-1)) {
                System.out.print(demo.get(i));
            } else {
                System.out.print(demo.get(i) + "-");
            }
        }
        System.out.println();
        System.out.printf("Demo SIZE is: %d", demo.size());
    }
}
