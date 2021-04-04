package demoSingleton;

public class SingletonContainer {
    //constructor
    private SingletonContainer() {
    }
    //fields
    private static PopulationTracker tracker;
    private static boolean isInitialized;
    //method
    public static PopulationTracker getTracker () {
        if (!isInitialized) {
            throw new IllegalStateException("demoSingleton.SingletonContainer not initialized call .init() first");
        }
        return tracker;
    }

    public static void init() {
        if (!isInitialized) {
            isInitialized = true;
            tracker = PopulationTracker.getInstance();
        }
    }
}
