package Pr04RandomArrayList;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomArrayList<T> extends ArrayList<T> {
    public T getRandomElement() {
        int index = ThreadLocalRandom.current().nextInt(super.size());
        T remove = super.remove(index);
        return remove;
    }
}
