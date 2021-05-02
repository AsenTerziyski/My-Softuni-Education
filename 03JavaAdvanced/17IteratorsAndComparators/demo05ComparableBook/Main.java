package demo05ComparableBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DemoBook demoBook1 = new DemoBook("A", 2000, "au1", "au2", "au3");
        DemoBook demoBook2 = new DemoBook("B", 2001, "au1", "au2", "au3");
        DemoBook demoBook3 = new DemoBook("C", 2002, "au1", "au2", "au3");
        DemoBook demoBook4 = new DemoBook("D", 2003, "au1", "au2", "au3");
        DemoBook demoBook5 = new DemoBook("E", 2004, "au1", "au2", "au3");

        ArrayList<DemoBook> collectionOfDemoBooks = new ArrayList<>();
        collectionOfDemoBooks.add(demoBook1);
        collectionOfDemoBooks.add(demoBook2);
        collectionOfDemoBooks.add(demoBook3);
        collectionOfDemoBooks.add(demoBook4);
        collectionOfDemoBooks.add(demoBook5);
        collectionOfDemoBooks.add(demoBook1);

        collectionOfDemoBooks.sort(new DemoBookComparator());
        for (DemoBook collectionOfDemoBook : collectionOfDemoBooks) {
            System.out.println(collectionOfDemoBook);
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        }
    }
}
