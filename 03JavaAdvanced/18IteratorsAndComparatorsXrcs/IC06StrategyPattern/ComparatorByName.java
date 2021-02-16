package IC06StrategyPattern;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int res = Integer.compare(o1.getName().length(), o2.getName().length());
        if (res==0) {
            res = o1.getName().toLowerCase().charAt(0) - o2.getName().toLowerCase().charAt(0);
        }
        return res;
    }
//    @Override
//    public int compare(Person o1, Person o2) {
//        String person1 = o1.getName();
//        String person2 = o2.getName();
//        int result = Integer.compare(person1.length(), person2.length());
//        if (result == 0) {
//            char firstLetter = person1.toLowerCase().charAt(0);
//            char secondLetter = person2.toLowerCase().charAt(0);
//            result = (int)(firstLetter - secondLetter);
//        }
//        return result;
//    }
}
