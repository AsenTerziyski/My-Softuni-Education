package Demo04Remove02;

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

    private void validateIndex(int index) {
        // this method is not visible for the user. its only purpose is to check if index is valid:
        if (index < 0 || index >= this.size) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + " out of bounds for size " + this.size);
        }
    }

    public int size() {
        return this.size;
    }

    public int remove(int index) {
        //validateIndex(index);
        // методът гет валидира индекса:
        int element = get(index);
//        if(this.size==1) {
//            //ако имам 1 елемент в масива, като го премахна правя реинициализация на масива:
//            this.elements = new int[8];
//            this.size = 0;
//        }
//        if (this.size - 1 >= 0) {
//            System.arraycopy(this.elements, 1, this.elements, 0, this.size - 1);
//        }
        if (this.size - 1 - index >= 0) {
            System.arraycopy(this.elements, 1, this.elements, 0, this.size - 1 - index);
        }

        this.elements[--this.size] = 0;

//        if (this.elements.length == this.size * 2 && this.size >= 8) {
//            int[] newElements = new int[this.size];
//            System.arraycopy(this.elements, 0, newElements, 0, this.size);
//            this.elements = newElements;
//        }
        if (this.elements.length == this.size * 4 && this.size >= 8) {
            int[] newElements = new int[this.size];
            System.arraycopy(this.elements, 0, newElements, 0, this.size);
            this.elements = newElements;
        }

        if (this.isEmpty()) {
            this.elements = new int[8];
            this.size = 0;
        }

        return element;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

}
