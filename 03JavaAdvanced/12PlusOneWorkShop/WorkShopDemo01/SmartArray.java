package WorkShopDemo01;

public class SmartArray {
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[8];
        this.size = 0;
    }

    public void add(int element) {
//        if (this.size == 0) {
//            this.elements[this.size] = element;
//        } else {
//            int[] newElements = new int[this.size + 1];
//
//            for (int i = 0; i < this.elements.length; i++) {
//                newElements[i] = this.elements[i];
//            }
//
//            this.elements = newElements;
//            this.elements[this.size] = element;
//        }
//        this.size++;

//        if (this.elements.length == this.size) {
//            int[] newElements = new int[this.size * 2];
//            for (int i = 0; i <this.elements.length; i++) {
//                newElements[i] = this.elements[i];
//            }
//            this.elements = newElements;
//        }
//        this.elements[this.size++] = element;

        if (this.elements.length == this.size) {
            int[] newElements = new int[this.size * 2];
            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            this.elements = newElements;
        }

        this.elements[this.size++] = element;
    }

    public int get(int index) {

        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + " out of bounds for size " + this.size);
        }
        return this.elements[index];
    }

    public int size() {
        return this.size;
    }

}
