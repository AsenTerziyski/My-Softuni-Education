package G01GenericBox;

//public class Box {
public class Box<T> {
    //private Object value;
    private T value;

//    public Box(Object value) {
////        this.value = value;
////    }

    public Box(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.format("%s: %s",
                this.value.getClass().getName()
                , value.toString());
    }
}
