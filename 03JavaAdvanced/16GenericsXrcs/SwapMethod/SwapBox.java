package SwapMethod;

import java.util.ArrayList;
import java.util.List;

public class SwapBox<T> {
    private List<T> values;

    public SwapBox() {
        this.values = new ArrayList<>();
    }

    public void addElement(T element) {
        this.values.add(element);
    }

    public void swapElement(int index1, int index2) {
        if (index1 >= 0 && index1 < this.values.size()) {
            if (index2 >= 0 && index2 < this.values.size()) {
                for (int i = 0; i < this.values.size(); i++) {
                    T firstElement = this.values.get(index1);
                    T tempElement = firstElement;
                    T secondElement = this.values.get(index2);
                    this.values.set(index1, secondElement);
                    this.values.set(index2, tempElement);
                }
            } else {
                throw new IllegalArgumentException(exceptionMessage(index2));
            }
        } else {
            throw new IllegalArgumentException(String.format(exceptionMessage(index1)));
        }


    }

    private String exceptionMessage(int index) {
        return String.format("Not Valid Index: INPUT index %d is Out Of Boundary! Must be between [0 - %d]!", index, this.values.size() - 1);
    }

    public List<T> getValues() {
        return values;
    }

    @Override
    public String toString() {
        return this.values.toString();
    }
}
