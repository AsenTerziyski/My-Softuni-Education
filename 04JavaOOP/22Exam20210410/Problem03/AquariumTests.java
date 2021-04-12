package aquarium;

import org.junit.Assert;
import org.junit.Test;

public class AquariumTests {

    @Test
    public void testEmptyTest() {
    }

    @Test
    public void testGetNameShouldReturnCorrectName() {
        Aquarium aquarium = new Aquarium("testName", 2);
        String expectedName = "testName";
        String actualName = aquarium.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldReturnExceptionIfNameNullOrEmpty() {
        String nameEmpty = " ";
        String nameNull = null;
        Aquarium emptyNameAquarium = new Aquarium(nameEmpty, 100);
        Aquarium nameNullAquarium = new Aquarium(nameNull, 100);
    }

    @Test
    public void testSetNameShouldWorkIfNameIsNotNullOrEmpty() {
        String expectedName = "testName";
        Aquarium aquarium = new Aquarium(expectedName, 100);
        String actualName = aquarium.getName();
        Assert.assertEquals(expectedName, actualName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetCapacityShouldReturnExceptionIfCapacityNegative() {
        int testCapacity = -1;
        Aquarium aquarium = new Aquarium("testName", testCapacity);
    }

    @Test
    public void testSetCapacityShouldWorkCorrectlyWhenCapacityEqualsOrBiggerThanZero() {
        int expectedCapacity = 10;
        Aquarium aquarium = new Aquarium("a", 10);
        Assert.assertEquals(10, aquarium.getCapacity());
    }

    @Test
    public void getCapacityShouldReturnCorrectCapacity() {
        int expected = 10;
        Aquarium aquarium = new Aquarium("testName", 10);
        int actual = aquarium.getCapacity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCountShouldReturnZeroIfNoFishInAquarium() {
        Aquarium testAquarium = new Aquarium("a", 10);
        int actualCount = testAquarium.getCount();
        Assert.assertEquals(0, actualCount);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddFishShouldThrowExceptionIfAquariumIsFull() {
        Aquarium aquarium = new Aquarium("a", 3);
        Fish fish1 = new Fish("f1");
        Fish fish2 = new Fish("f2");
        Fish fish3 = new Fish("f3");
        Fish fish4 = new Fish("f4");
        aquarium.add(fish1);
        aquarium.add(fish2);
        aquarium.add(fish3);
        aquarium.add(fish4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveFishShouldThrowExceptionIfNoSuchFishInAquarium() {
        Aquarium aquarium = new Aquarium("a", 3);
        Fish fish1 = new Fish("f1");
        Fish fish2 = new Fish("f2");
        Fish fish3 = new Fish("f3");
        aquarium.add(fish1);
        aquarium.add(fish2);
        aquarium.add(fish3);
        aquarium.remove("f4");
    }

    @Test
    public void testSellFishShouldWorkCorrectly() {
        Aquarium aquarium = new Aquarium("a", 3);
        Fish fish1 = new Fish("f1");
        Fish fish2 = new Fish("f2");
        Fish fish3 = new Fish("f3");
        aquarium.add(fish1);
        aquarium.add(fish2);
        aquarium.add(fish3);
        Fish actualFish = aquarium.sellFish("f1");
        Assert.assertEquals(fish1, actualFish);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSellFishShouldThrowExceptionIfNoSuchAFishInAquarium() {
        Aquarium aquarium = new Aquarium("a", 3);
        Fish fish1 = new Fish("f1");
        Fish fish2 = new Fish("f2");
        Fish fish3 = new Fish("f3");
        aquarium.add(fish1);
        aquarium.add(fish2);
        aquarium.add(fish3);
        Fish actualFish = aquarium.sellFish("f100");
        Assert.assertEquals(fish1, actualFish);
    }

    @Test
    public void testReportShouldReturnCorrectStringFormat() {
        String expected = "Fish available at a: f1, f2, f3";
        Aquarium aquarium = new Aquarium("a", 3);
        Fish fish1 = new Fish("f1");
        Fish fish2 = new Fish("f2");
        Fish fish3 = new Fish("f3");
        aquarium.add(fish1);
        aquarium.add(fish2);
        aquarium.add(fish3);
        String actual = aquarium.report();
        Assert.assertEquals(expected, actual);
    }

}

