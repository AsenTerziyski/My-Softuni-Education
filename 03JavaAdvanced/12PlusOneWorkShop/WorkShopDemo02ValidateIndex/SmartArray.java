package WorkShopDemo02ValidateIndex;

public class SmartArray {
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[8];
        this.size = 0;
    }

    public void add(int element) {
        if (this.elements.length == this.size) {
            int[] newElements = new int[this.size * 2];
            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            this.elements = newElements;
        }

        this.elements[this.size++] = element;
    }

    public int get(int index) {
        validateIndex(index);
        return this.elements[index];
    }

    private void validateIndex (int index) {
        // this method is not visible for the user. its only purpose is to check if
        // index is valid:
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + " out of bounds for size " + this.size);
        }
    }

    public int size() {
        return this.size;
    }

}
