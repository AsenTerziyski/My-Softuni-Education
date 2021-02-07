package workshopDemoCar;

public class Tyre {
    private int size;
    private String producer;

    public Tyre(int size, String producer) {
        this.size = size;
        this.producer = producer;
    }

    public int getSize() {
        return size;
    }

    public String getProducer() {
        return producer;
    }
}
