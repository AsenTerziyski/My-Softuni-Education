package demo03Iterable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add('b');

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
