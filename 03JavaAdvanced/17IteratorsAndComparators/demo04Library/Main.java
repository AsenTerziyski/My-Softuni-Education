package demo04Library;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book demoBook = new Book("A", 1978, "A", "B");
        Book demoBook1 = new Book("C", 1878, "C", "D", "E");
        Book demoBook2 = new Book("F", 1778, "F", "G", "H");
        Book[] books = new Book[]{demoBook, demoBook1, demoBook2};
        DemoLibrary demoLibrary1 = new DemoLibrary(books);

        for (Book book : demoLibrary1) {
            List<String> authors = book.getAuthors();
            System.out.print("Author(s): ");
            for (String author : authors) {
                System.out.print(author + " ");
            }
            System.out.println();
            System.out.println("Title: " + book.getTitle());
            System.out.println("Year" + book.getYear());
        }

        DemoLibrary demoLibrary2 = new DemoLibrary(new Book("A", 1900, "Emo"));
        DemoLibrary demoLibrary3 = new DemoLibrary();

    }
}
