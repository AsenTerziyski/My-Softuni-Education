package G11Threeuple;

public class Tuple<K,V, X> {
    private K firstElement;
    private V secondElement;
    private X thirdElement;

    public Tuple(K firstElement, V secondElement, X thirdElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
        this.thirdElement = thirdElement;
    }

    @Override
    public String toString() {
        String output = String.format("%s -> %s -> %s", this.firstElement, this.secondElement, this.thirdElement);
        return output.trim();
    }
}
