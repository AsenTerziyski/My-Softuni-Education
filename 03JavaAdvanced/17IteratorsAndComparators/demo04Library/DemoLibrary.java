package demo04Library;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class DemoLibrary implements Iterable<Book> {
    private Book[] books;
    private static int ID = 0;

    @Override
    public Iterator<Book> iterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator<Book> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < books.length;
        }
        @Override
        public Book next() {
            return books[index++];
        }
    }

    public DemoLibrary(Book... books) {
        ID++;
        if (books.length == 0) {
            System.out.println();
            System.out.println(String.format("No books in your library %s №%d. Please add one or more!", this.getClass().getSimpleName(), ID));
        }
        this.setBooks(books);
    }

    private void setBooks(Book... books) {
        this.books = books;
    }

}
