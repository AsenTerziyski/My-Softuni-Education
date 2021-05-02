package demo05ComparableBook;

import IC04BookComparator.Book;

import java.util.Iterator;

public class DemoLibrary implements Iterable<DemoBook> {
    private DemoBook[] demoBooks;

    @Override
    public Iterator<DemoBook> iterator() {
        DemoLibraryIterator demoLibraryIterator = new DemoLibraryIterator();
        return demoLibraryIterator;

    }

    public DemoLibrary(DemoBook... demoBooks) {
        this.demoBooks = demoBooks;
    }

    private class DemoLibraryIterator implements Iterator<DemoBook> {
        private int counter = 0;

        @Override
        public boolean hasNext() {
            return counter < demoBooks.length;
        }

        @Override
        public DemoBook next() {
            return demoBooks[counter++];
        }
    }


}
