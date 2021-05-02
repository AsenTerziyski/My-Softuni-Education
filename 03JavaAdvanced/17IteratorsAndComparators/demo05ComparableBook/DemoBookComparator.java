package demo05ComparableBook;

import java.util.Comparator;

public class DemoBookComparator implements Comparator<DemoBook> {
    @Override
    public int compare(DemoBook b1, DemoBook b2) {
        int result = b1.getTitle().compareTo(b2.getTitle());
        if (result !=0) {
            result = Integer.compare(b2.getYear(), b1.getYear());
        }
        return result;
    }
}
