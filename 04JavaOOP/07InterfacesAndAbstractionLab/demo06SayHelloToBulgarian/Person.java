package demo06SayHelloToBulgarian;

public interface Person {
    String getPersonName();
    default void sayHello() {
        System.out.println("Hello");
    }

}
