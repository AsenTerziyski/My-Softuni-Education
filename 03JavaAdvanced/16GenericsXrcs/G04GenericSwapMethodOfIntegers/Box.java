package G04GenericSwapMethodOfIntegers;
import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;
    public Box() {
        this.values = new ArrayList<>();
    }
    public void addValue(T value) {
        this.values.add(value);
    }

    public void swap(int index1, int index2) {
        if (index1 >= 0 && index1 < this.values.size()) {
            if (index2 >= 0 && index2 < this.values.size()) {
                T firstElement = this.values.get(index1);
                T temp = firstElement;
                T secondElement = this.values.get(index2);
                this.values.set(index1, secondElement);
                this.values.set(index2, temp);
            } else {
//                throw new IndexOutOfBoundsException("Warning: One or Two Index/s is/are notValid:"
//                        + System.lineSeparator() +
//                        "indexOne = " + index1 + ";"
//                        + System.lineSeparator() +
//                        "indexTwo = " + index2 + ";");
                throw new IndexOutOfBoundsException("Index out of bound");
            }
        }
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
