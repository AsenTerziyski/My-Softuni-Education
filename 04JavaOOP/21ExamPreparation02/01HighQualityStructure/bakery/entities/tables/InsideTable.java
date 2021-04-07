package bakery.entities.tables;

public class InsideTable extends BaseTable {
    private static final double PRICE_PER_PERSON = 2.50;

    // the constructor of the ChildClass should be public, while the constructor of ParentClass is protected:
    // in this case we have BaseTable - ParentClass and InsideTable and OutsideTable which are ChildClasses:
    public InsideTable(int tableNumber, int capacity) {
        super(tableNumber, capacity, PRICE_PER_PERSON);
    }
}
