package demoPrototype;

import demoSingleton.PopulationTracker;

public class SingletonContainer {
    //constructor
    private SingletonContainer() {
    }
    //fields
    private static PopulationTracker tracker;
    private static Datastore datastore;
    private static boolean isInitialized;
    //method
    public static PopulationTracker getTracker () {
        validateInitilization();
        return tracker;
    }

    private static void validateInitilization() {
        if (!isInitialized) {
            throw new IllegalStateException("demoSingleton.demoPrototype.SingletonContainer not initialized call .init() first");
        }
    }

    public static Datastore getDatastore() {
        validateInitilization();
        return datastore;
    }

    public static void init() {
        if (!isInitialized) {
            isInitialized = true;
            tracker = PopulationTracker.getInstance();
            datastore = Datastore.getInstance();
        }
    }
}
