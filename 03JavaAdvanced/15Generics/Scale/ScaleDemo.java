package Scale;

public class ScaleDemo<T extends Comparable<T>> {
    private T left;
    private T right;

    public ScaleDemo(T left, T right) {
        this.setLeft(left);
        this.setRight(right);
    }

    private void setLeft(T left) {
        if (left != null) {
            this.left = left;
        } else {
            exceptionMessage();
        }
    }

    private void setRight(T right) {
        if (left != null) {
            this.right = right;
        } else {
            exceptionMessage();
            return;
        }
    }

    public T getHeavier() {
        if (left.compareTo(right) > 1) {
            return left;
        } else if (left.compareTo(right) < 1) {
            return right;
        }
        return left;
    }

    private void exceptionMessage() {
        throw new IllegalArgumentException("Can not be NULL!");
    }
}
