package demoSingleton;

import java.util.Map;
import java.util.TreeMap;

public class PopulationTracker {
    private Map<String, Long> counts;
    private static PopulationTracker instance;

    private PopulationTracker() {
        this.counts = new TreeMap<>();
    }

// команда geti + enter прави автоматично гетИнстънс:
    public static PopulationTracker getInstance() {
        if (instance == null) {
            instance = new PopulationTracker();
        }
            return instance;
    }

    public void add(String location, long count) {
        this.counts.putIfAbsent(location, 0L);
        this.counts.put(location, counts.get(location) + count);


    }

    public void remove(String location, long count) {
        if (this.counts.containsKey(location)) {
            this.counts.put(location, counts.get(location) - count);
        }
    }
}
