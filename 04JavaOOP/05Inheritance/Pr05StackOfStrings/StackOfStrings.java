package Pr05StackOfStrings;

import java.util.ArrayList;
import java.util.List;

public class StackOfStrings {
    private List<String> data;

    public StackOfStrings() {
        this.data = new ArrayList<>();
    }

    public void push(String item) {
        this.data.add(item);
    }

    public String peek() {
        if (!isEmpty()) {
            String lastElement = this.data.get(this.data.size() - 1);
            return lastElement;
        }
        return null;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String poppedElement = this.data.remove(this.data.size() - 1);
        return poppedElement;
    }

    public boolean isEmpty() {
        return this.data.isEmpty();
    }

}
