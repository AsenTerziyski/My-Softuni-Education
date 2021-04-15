package computers;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComputerManagerTests {
    // TODO: Test ComputerManager
    @Test
    public void testEmptyTest() {
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetComputersShouldReturnUnmodifiableCollection() {
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);
//        ArrayList<Computer> collectionOfComputers = new ArrayList<>();
//        collectionOfComputers.add(computer1);
//        collectionOfComputers.add(computer2);
//        collectionOfComputers.add(computer3);
        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);
        computerManager.getComputers().add(computer1);
    }
    @Test
    public void testGetCountShouldReturnCorrectCountOfComputersInTheCollection() {
        ComputerManager computerManager = new ComputerManager();
        int expected = 0;
        Assert.assertEquals(0, computerManager.getCount());

        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);

        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);

        expected = 3;
        Assert.assertEquals(expected, computerManager.getCount());

    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddComputerShouldThrowExceptionIfComputerToAddIsNull() {
        ComputerManager computerManager = new ComputerManager();
        computerManager.addComputer(null);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testAddComputerShouldReturnExceptionIfComputerExists() {
        ComputerManager computerManager = new ComputerManager();
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);

        computerManager.addComputer(computer1);
    }

    @Test
    public void testAddComputerShouldWorkCorrectly() {
        ComputerManager computerManager = new ComputerManager();
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);
        Assert.assertEquals(computer1, computerManager.getComputer("man1", "m1"));
    }

    @Test
    public void testRemoveComputerShouldWorkCorrectlyIfComputerIsInCollection(){
        ComputerManager computerManager = new ComputerManager();
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);
        Computer removeComputer = computerManager.removeComputer("man1", "m1");
        Assert.assertEquals(computer1, removeComputer);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testGetComputersByManufacturerShouldThrowExceptionIfManufacturerNull() {
        ComputerManager computerManager = new ComputerManager();
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man2", "m2", 2);
        Computer computer3 = new Computer("man3", "m3", 3);
        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);
        computerManager.getComputersByManufacturer(null);
    }

    @Test
    public void testGetComputersByManufacturerShouldReturnCorrectListOfComputers() {
        ComputerManager computerManager = new ComputerManager();
        Computer computer1 = new Computer("man1", "m1", 1);
        Computer computer2 = new Computer("man1", "m2", 2);
        Computer computer3 = new Computer("man1", "m3", 3);
        Computer computer4 = new Computer("man2", "m3", 4);
        Computer computer5 = new Computer("man3", "m3", 5);
        Computer computer6 = new Computer("man4", "m3", 6);
        Computer computer7 = new Computer("man5", "m3", 7);
        ArrayList<Computer> expectedComputers = new ArrayList<>();
        expectedComputers.add(computer1);
        expectedComputers.add(computer2);
        expectedComputers.add(computer3);

        computerManager.addComputer(computer1);
        computerManager.addComputer(computer2);
        computerManager.addComputer(computer3);
        computerManager.addComputer(computer4);
        computerManager.addComputer(computer5);
        computerManager.addComputer(computer6);
        computerManager.addComputer(computer7);
        List<Computer> actualComputers = computerManager.getComputersByManufacturer("man1");
        Assert.assertEquals(expectedComputers.size(), actualComputers.size());
        for (int i = 0; i <actualComputers.size(); i++) {
            for (int j = 0; j <expectedComputers.size(); j++) {
                String actual = actualComputers.get(i).getManufacturer();
                String expected = expectedComputers.get(j).getManufacturer();
                Assert.assertEquals(expected, actual);

            }

        }

    }



}