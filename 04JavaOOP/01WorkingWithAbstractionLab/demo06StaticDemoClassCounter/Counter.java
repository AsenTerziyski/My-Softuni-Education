package demo06StaticDemoClassCounter;

public class Counter {
    private int count;
    private static int instanceCounter;

    public Counter() {
        count++;
        instanceCounter++;
    }

    public void doSomething(String input) {
        count = count + 2;
        System.out.println("!" + input + count + "!" + " " + "!!!" + instanceCounter + "!!!");
    }

    @Override
    public String toString() {
        return "count + " + count + " instanceCounter = " + instanceCounter;
    }
}
