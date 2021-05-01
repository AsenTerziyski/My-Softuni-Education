package demo02Book;

import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("A", 1978, "A");
        Book book2 = new Book("B", 2000, "B", "C", "D");

        List<String> authors = book1.getAuthors();
        for (String author : authors) {
            System.out.println(author);
        }

        List<String> authors1 = book2.getAuthors();
        for (String s : authors1) {
            System.out.println(s);
        }

        //Book book3 = new Book("X", 0, "A");
    }
}
