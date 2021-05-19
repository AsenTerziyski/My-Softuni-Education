package strategyPattern;

import strategyPattern.Strategy;

public class StrategyMultiply implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        return n1 * n2;
    }
}
