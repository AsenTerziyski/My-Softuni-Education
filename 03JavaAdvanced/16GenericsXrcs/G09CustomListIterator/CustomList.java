package G09CustomListIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> data;

    public CustomList() {
        this.data = new ArrayList<>();
    }

    public void add(T element) {
        this.data.add(element);
    }

    public T remove(int index) {
        T removedElement = this.data.remove(index);
        return removedElement;
    }

    public boolean contains(T element) {
        return this.data.contains(element);
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < this.data.size()) {
            if (index2 >= 0 && index2 < this.data.size()) {
                T firstElement = this.data.get(index1);
                T temp = firstElement;
                T secondElement = this.data.get(index2);
                this.data.set(index1, secondElement);
                this.data.set(index2, temp);
            } else {
                throw new IndexOutOfBoundsException("Warning");
            }
        }
    }

    public long countGreaterThan(T element) {
        return this.data
                .stream()
                .filter(el -> el.compareTo(element) > 0)
                .count();
    }

    public T getMax() {
        T maxElement = null;
        if (!this.data.isEmpty()) {
            maxElement = this.data.get(0);
            for (T datum : this.data) {
                if (datum.compareTo(maxElement) > 0) {
                    maxElement = datum;
                }
            }
        }
        return maxElement;
    }

    public T getMin() {
        T minElement = null;
        if (!this.data.isEmpty()) {
            minElement = this.data.get(0);
            for (T datum : data) {
                if (datum.compareTo(minElement) < 0) {
                    minElement = datum;
                }
            }
        }
        return minElement;
    }

    public int size() {
        int size = this.data.size();
        return size;
    }

    public T get(int index) {
        return this.data.get(index);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : this.data) {
            sb
                    .append(String.format("%s: %s", value.getClass().getName(), value.toString()))
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < data.size();
            }

            @Override
            public T next() {
                //this.index++;
                T element = data.get(index);
                index++;
                return element;
            }
        };
    }
}
