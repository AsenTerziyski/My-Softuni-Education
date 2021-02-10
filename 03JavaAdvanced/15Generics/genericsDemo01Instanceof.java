import java.util.ArrayList;
import java.util.List;

public class genericsDemo01Instanceof {
    public static void main(String[] args) {
        List elements = new ArrayList();
        elements.add("Skid Row");
        elements.add("Winger");
        elements.add('a');
        elements.add('b');
        elements.add(100);
        elements.add(5000);
//        for (Object element : elements) {
//            System.out.println(element instanceof Integer);
//            System.out.println(element instanceof String);
//        }
        System.out.println();
        for (int i = 0; i <elements.size(); i++) {
            System.out.println(elements.get(i) instanceof Integer);
            System.out.println(elements.get(i) instanceof String);
        }
    }
}
