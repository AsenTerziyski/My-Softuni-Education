package strategyPattern;

public class Main {
    public static void main(String[] args) {

        Context context = new Context(new StrategyAdd());
        int i = context.executeStrategy(1, 2);
        System.out.println(i);

        context = new Context(new StrategyMultiply());
        System.out.println(context.executeStrategy(2, 10));

        context = new Context(new StrategySubtract());
        System.out.println(context.executeStrategy(10, 10));
    }
}
