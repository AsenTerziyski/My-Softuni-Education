package blueOrigin;

import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class SpaceshipTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Spaceship
    private Spaceship testSpaceship;

    @Before
    public void setTestSpaceship() {
        this.testSpaceship = new Spaceship("testSpaceship", 3);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameToFailWhenNull() {
        new Spaceship(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameToFailWhenNameEmpty() {
        new Spaceship("     ", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityShouldThrowExceptionWhenBelowZero() {
        new Spaceship("testName", -10);
    }

    @Test
    public void testGetAstronautsShouldReturnTwoWhenTwoAdded() {
        Spaceship testSpaceship = new Spaceship("testSpaceship", 10);
        testSpaceship.add(new Astronaut("A1", 100));
        testSpaceship.add(new Astronaut("A2", 100));
        int actualCount = testSpaceship.getCount();
        assertEquals(2, actualCount);
    }

    @Test
    public void testGetCountShouldReturnZeroWhenEmpty() {
        Assert.assertEquals(0, testSpaceship.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddSameAstronautShouldThrowException() {
        testSpaceship.add(new Astronaut("test", 50));
        testSpaceship.add(new Astronaut("test", 50));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddAstronautShouldThrowExceptionWhenCapacityIsExceeded() {
        testSpaceship.add(new Astronaut("test0", 50));
        testSpaceship.add(new Astronaut("test1", 50));
        testSpaceship.add(new Astronaut("test2", 50));
        testSpaceship.add(new Astronaut("test3", 50));
    }

    @Test
    public void testRemoveShouldReturnFalseWhenAstronautIsNotInTheSpaceship() {
        testSpaceship.add(new Astronaut("test0", 50));
        testSpaceship.add(new Astronaut("test1", 50));
        assertFalse(testSpaceship.remove("test3"));
    }

    @Test
    public void testRemoveShouldReturnTrueWhenAstronautIsInTheSpaceship() {
        testSpaceship.add(new Astronaut("test0", 50));
        testSpaceship.add(new Astronaut("test1", 50));
        assertTrue(testSpaceship.remove("test0"));
    }

}

