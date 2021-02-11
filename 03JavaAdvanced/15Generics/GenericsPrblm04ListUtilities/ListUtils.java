package GenericsPrblm04ListUtilities;

import java.util.Collections;
import java.util.List;

public class ListUtils {
    public ListUtils() {
    }

    public static <T extends Comparable<T>> T getMax(List<T> elements) {
        ensureNotEmpty(elements.isEmpty());
        return Collections.max(elements);
    }

    private static void ensureNotEmpty(boolean empty) {
        if (empty) {
            throw new IllegalArgumentException();
        }
    }

    public static <T extends Comparable<T>> T getMin(List<T> elements) {
        ensureNotEmpty(elements.isEmpty());
        return Collections.min(elements);
    }

}

