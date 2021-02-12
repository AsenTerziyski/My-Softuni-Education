package G05GenericCountMethodStrings;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Box<T extends Comparable<T>> {
    private List<T> values;
    public Box() {
        this.values = new ArrayList<>();
    }
    // Правя метод, който няма да връща нищо, а само ще добавя
    // елементи към нашата колекция:
    public void addValue(T value) {
        this.values.add(value);
    }
    // Правя втори метод войд, който няма да връща нищо,
    // а само ще разменя:
    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < this.values.size()) {
            if (index2 >= 0 && index2 < this.values.size()) {
                T firstElement = this.values.get(index1);
                T temp = firstElement;
                T secondElement = this.values.get(index2);
                this.values.set(index1, secondElement);
                this.values.set(index2, temp);
            } else {
                throw new IndexOutOfBoundsException("Warning: One or Two Index/s is/are notValid:"
                        + System.lineSeparator() +
                        "indexOne = " + index1 + ";"
                        + System.lineSeparator() +
                        "indexTwo = " + index2 + ";");
            }
        }
    }

    // Creating method which returns the count of greater elements:
    public long countGreaterElements(T toCompare) {
        long count = this.values.stream().filter(el -> el.compareTo(toCompare) > 0).count();
        return count;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T value : values) {
            sb
                    .append(String.format("%s: %s", value.getClass().getName(), value.toString()))
                    .append(System.lineSeparator());
        }
        return sb.toString().trim();
    }
}
