package demoPrototype;

import java.util.HashMap;
import java.util.Map;

public class Datastore {

    public static class EntityExistExecution extends RuntimeException {

    }


    private Map<String, Address> addresses;
    private static Datastore instance;

    private Datastore() {
        addresses = new HashMap<>();
    }

    public static Datastore getInstance() {
        if (instance == null) {
            instance = new Datastore();
        }
        return instance;
    }

    public void createAddress(String userId, Address address) {
        if (addresses.containsKey(userId)) {
            throw new EntityExistExecution();
        }
        this.addresses.put(userId, address);
    }

    public void overwriteAddress(String userId, Address address) {
        if (addresses.containsKey(userId)) {
            this.addresses.put(userId, address);
        }
    }
    public Address getUserAddress(String id) {
        return this.addresses.get(id);
    }
}
