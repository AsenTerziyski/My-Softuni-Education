package demo06StaticDemoClassCounter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter);
        counter.doSomething("Try this:");
        counter.doSomething("Try this second time:");
        System.out.println(counter);
        Counter counter1 = new Counter();
        System.out.println(counter1);
        Counter counter2 = new Counter();
        System.out.println(counter2);
    }
}
