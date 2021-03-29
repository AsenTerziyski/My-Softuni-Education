package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static junit.framework.TestCase.assertEquals;

public class DatabaseTest {
    public static final int MAXSIZE = 16;
    private static final Integer[] ELEMENTS = new Integer[]{4, 16, 19, 32, 5};
    private Database database;

    // @Before executes always before other tests:
    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(ELEMENTS);

    }

//    @After
//    public void allTestsPassed () {
//        System.out.println("AllTestsPassed!");
//    }

    @Test
    public void when_correctElementsArePassed_then_createDatabaseInstance() throws OperationNotSupportedException {
        //1A => arrange
        //Integer[] elements = new Integer[]{4, 16, 19, 32, 5};
        //2A => act - create instance
        //Database database = new Database(elements);
        //3A assert
//        Assert.assertEquals(elements.length, database.getElements().length);
//        Assert.assertArrayEquals(elements, database.getElements());
        assertEquals(ELEMENTS.length, this.database.getElements().length);
        Assert.assertArrayEquals(ELEMENTS, this.database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void whenElementsAreMoreThan16ArePassedToConstructor_then_ExceptionIsThrown() throws OperationNotSupportedException {
        int n = MAXSIZE + 1;
//        Integer[] elements = new Integer[n];
//        for (int i = 0; i < elements.length; i++) {
//            elements[i] = i;
//        }
//
//        Integer[] elements = new Integer[n];
//        Database database = new Database(elements);
        new Database(new Integer[n]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void whenElementsLessThan1ArePassedToConstructor_then_ExceptionIsThrown() throws OperationNotSupportedException {
//        int n = 0;
//        new Database(new Integer[n]);
        new Database();
    }

    //unitTests for AddMethod
    @Test
    public void when_validElementIsPassedToAddMethod_then_elementIsAddedAtLastPosition() throws OperationNotSupportedException {
//        Integer[] elements = new Integer[]{4, 16, 19, 32, 5};
//        Database database = new Database(elements);
        int element = 15;
        this.database.add(element);
        Integer[] databaseElements = this.database.getElements();
        //Assert.assertEquals(elements.length + 1, databaseElements.length);
        Assert.assertEquals(ELEMENTS.length + 1, databaseElements.length);
        Assert.assertEquals(Integer.valueOf(element), databaseElements[databaseElements.length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_invalidElementIsPassedToAddMethod_then_exceptionIsExpected() throws OperationNotSupportedException {
        //Integer[] elements = new Integer[]{4, 16, 19, 32, 5};
        //Database database = new Database(elements);
        Integer invalidElement = null;
        this.database.add(invalidElement);
    }

    //remove
    @Test
    public void when_removeElement_then_lastElementIsRemoved() throws OperationNotSupportedException {
//        Integer[] elements = new Integer[]{4, 16, 19, 32, 5};
//        Database database = new Database(elements);
        this.database.remove();
        //Assert,assertEquals(elements.length-1, database.getElements().length);
        //assertEquals(elements.length - 1, database.getElements().length);
        assertEquals(ELEMENTS.length - 1, database.getElements().length);
//        Integer elementsElement = elements[elements.length-2];
//        Integer dataBaseLastElement = database.getElements()[database.getElements().length-1];
        Integer[] databaseElements = this.database.getElements();
        //Integer elementsElement = elements[elements.length - 2];
        Integer elementsElement = ELEMENTS[ELEMENTS.length - 2];
        assertEquals(elementsElement, databaseElements[databaseElements.length - 1]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_tryToRemoveElementFromEmptyCollection_then_exceptionIsExpected() throws OperationNotSupportedException {
        //Database database = new Database(new Integer[1]);
//        database.remove();
//        database.remove();
        int databaseLength = this.database.getElements().length;
        for (int i = 0; i <= databaseLength ; i++) {
            this.database.remove();
            }
    }

}
