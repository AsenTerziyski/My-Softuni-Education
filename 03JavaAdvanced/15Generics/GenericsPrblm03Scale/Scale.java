package GenericsPrblm03Scale;

public class Scale<T extends Comparable<T>> {
    private T left;
    private T right;

    // конструктор:
    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    //метод:
    public T getHeavier() {
        if (left == right) {
            return null;
        }
        if (left.compareTo(right) > 1) {
            return left;
        }
        return right;
    }
}
