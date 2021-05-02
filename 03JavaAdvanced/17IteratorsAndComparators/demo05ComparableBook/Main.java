package demo05ComparableBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DemoBook demoBook1 = new DemoBook("A", 2000, "au1", "au2", "au3");
        System.out.println(demoBook1.getBookNumber());
        DemoBook demoBook2 = new DemoBook("B", 2001, "au1", "au2", "au3");
        System.out.println(demoBook2.getBookNumber());
        DemoBook demoBook3 = new DemoBook("C", 2002, "au1", "au2", "au3");
        System.out.println(demoBook3.getBookNumber());
        DemoBook demoBook4 = new DemoBook("D", 2003, "au1", "au2", "au3");
        System.out.println(demoBook4.getBookNumber());
        DemoBook demoBook5 = new DemoBook("E", 2004, "au1", "au2", "au3");
        System.out.println(demoBook5.getBookNumber());

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
