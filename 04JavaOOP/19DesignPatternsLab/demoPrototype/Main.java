package demoPrototype;

public class Main {

    //статичен блок, който инициализира СингълтонКонтайенер:
    static {
        SingletonContainer.init();
    }

    public static void main(String[] args) {
        Address address = new Address("A", "B", "a@b", "123",
                "S", "B", "X", "l1", "l2", "100");
        //demoPrototype.SingletonContainer.init();
        Datastore datastore = SingletonContainer.getDatastore();
        datastore.createAddress("A", address);
        updateUserAddress();

    }

    private static void updateUserAddress() {
        Datastore datastore = SingletonContainer.getDatastore();
        // с clone правим копие на инстанцията ?
        System.out.println(datastore.getUserAddress("A"));
        Address addrss = datastore.getUserAddress("A").clone();
        System.out.println(addrss);
        addrss.setCountry("Germany");
        boolean save = true;
        if (save) {
            datastore.overwriteAddress("A", addrss);
        }
        System.out.println(datastore.getUserAddress("A"));
    }
}
