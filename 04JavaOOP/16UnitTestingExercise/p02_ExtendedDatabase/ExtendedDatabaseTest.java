package p02_ExtendedDatabase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static junit.framework.TestCase.assertEquals;

public class ExtendedDatabaseTest {
    public static final int MAXSIZE = 16;
    private static final Person[] PEOPLE = new Person[]{new Person(1, "A"), new Person(2, "B"), new Person(3, "C")};
    private Database database;

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    @Test
    public void when_correctElementsArePassed_then_createDatabaseInstance() throws OperationNotSupportedException {
        assertEquals(PEOPLE.length, this.database.getElements().length);
        Assert.assertArrayEquals(PEOPLE, this.database.getElements());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void whenElementsAreMoreThan16ArePassedToConstructor_then_ExceptionIsThrown() throws OperationNotSupportedException {
        int n = MAXSIZE + 1;
        new Database(new Person[n]);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void whenElementsLessThan1ArePassedToConstructor_then_ExceptionIsThrown() throws OperationNotSupportedException {
        new Database();
    }

    @Test
    public void when_validElementIsPassedToAddMethod_then_elementIsAddedAtLastPosition() throws OperationNotSupportedException {
        Person expectedPerson = new Person(4, "D");
        this.database.add(expectedPerson);
        Person[] databaseElements = this.database.getElements();
        Assert.assertEquals(PEOPLE.length + 1, databaseElements.length);
        Person lastPerson = databaseElements[databaseElements.length - 1];
        Assert.assertEquals(expectedPerson.getId(), lastPerson.getId());
        Assert.assertEquals(expectedPerson.getUsername(), lastPerson.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_invalidElementIsPassedToAddMethod_then_exceptionIsExpected() throws OperationNotSupportedException {
        this.database.add(null);
    }

    @Test
    public void when_removeElement_then_lastElementIsRemoved() throws OperationNotSupportedException {
        this.database.remove();
        assertEquals(PEOPLE.length - 1, database.getElements().length);
        Person[] databasePersons = this.database.getElements();
        Person lastPerson = databasePersons[databasePersons.length - 1];
        Person expectedPerson = PEOPLE[PEOPLE.length - 2];
        assertEquals(expectedPerson.getId(), lastPerson.getId());
        assertEquals(expectedPerson.getUsername(), lastPerson.getUsername());
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_tryToRemoveElementFromEmptyCollection_then_exceptionIsExpected() throws OperationNotSupportedException {
        database = new Database(new Person(4, "D"));
        database.remove();
        database.remove();
    }

    //findByUsername:

    @Test(expected = OperationNotSupportedException.class)
    public void when_nullPassedToFindByUsername_then_exceptionIsThrown() throws OperationNotSupportedException {
        this.database.findByUsername(null);
    }

    @Test
    public void when_validUsernameIsPassedToFindByUser_then_returnPerson() throws OperationNotSupportedException {
        Person actualPerson = this.database.findByUsername("B");
        int id = actualPerson.getId();
        String username = actualPerson.getUsername();

        Person expectedPerson = PEOPLE[1];
        int expectedId = expectedPerson.getId();
        String expectedUsername = expectedPerson.getUsername();

        assertEquals(expectedId, id);
        assertEquals(expectedUsername, username);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void when_findByUsernameIsAppliedOnEmptyArr_then_exceptionIsExpected() throws OperationNotSupportedException {
        this.database = new Database(PEOPLE);
        database.remove();
        database.remove();
        database.remove();
        database.findByUsername("A");
    }

    //findByID

    @Test(expected = OperationNotSupportedException.class)
    public void when_findByIdIsAppliedOnEmptyArr_then_exceptionIsExpected() throws OperationNotSupportedException {
        database.remove();
        database.remove();
        database.remove();
        database.findById(2);
    }

    @Test
    public void when_validIdIsPassedToFindById_then_returnPerson() throws OperationNotSupportedException {
        Person actualPerson = database.findById(1);
        int id = actualPerson.getId();
        String username = actualPerson.getUsername();

        Person expectedPerson = PEOPLE[0];
        int expectedId = expectedPerson.getId();
        String expectedUsername = expectedPerson.getUsername();

        assertEquals(expectedId, id);
        assertEquals(expectedUsername, username);

    }


}