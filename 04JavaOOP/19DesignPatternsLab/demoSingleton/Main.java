package demoSingleton;

public class Main {
    public static void main(String[] args) {

//        demoSingleton.PopulationTracker populationTracker = new demoSingleton.PopulationTracker();
//        populationTracker.add("Sofia", 10);
//        populationTracker.add("Plovdiv", 100);

        SingletonContainer.init();
        PopulationTracker tracker = SingletonContainer.getTracker();
        tracker.add("Sofia", 10);
        tracker.add("Plovdiv", 100);
        //demoSingleton.SingletonContainer.init();
        readNewPopulationData();
        System.out.println();
        demoSingleton.PopulationTracker tracker1 = demoSingleton.SingletonContainer.getTracker();
        tracker1.add("Sofia", 10);
        tracker1.add("Plovdiv", 100);
        System.out.println();
    }

    public static void readNewPopulationData() {
        PopulationTracker tracker = SingletonContainer.getTracker();
        tracker.add("Sofia", 10);
        tracker.add("Plovdiv", 100);
    }
}
