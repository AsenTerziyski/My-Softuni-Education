package strategyPattern;

import strategyPattern.Strategy;

public class StrategySubtract implements Strategy {
    @Override
    public int doOperation(int n1, int n2) {
        if (n1 > n2) {
            return n1 - n2;
        } else if (n1 < n2) {
            return n2 - n1;
        } else {
            return 0;
        }
    }


}
