package halfLife;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class PlayerTests {

//    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS Player
//    @Test
//    public void testEmptyTest() {
//    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldTrowExceptionIfNameEmpty() {
        String emptyName = "   ";
        Player testPlayer = new Player(emptyName, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testSetNameShouldTrowExceptionIfNameNull() {
        String nullName = null;
        Player testPlayer = new Player(nullName, 10);
    }

    @Test
    public void testGetUserNameShouldReturnCorrectName() {
        String expectedUserName = "testUser";
        Player testPlayer = new Player("testUser", 10);
        String actualName = testPlayer.getUsername();
        Assert.assertEquals(expectedUserName, actualName);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setHealthShouldThrowExceptionIfHealthNegative() {
        Player testPlayer = new Player("TestPlayer", -1);
    }

    @Test
    public void testGetHealthShouldReturnCorrectGetHealth() {
        int expected = 10;
        Player player = new Player("a", 10);
        int actual = player.getHealth();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void testAddGunShouldThrowExceptionIfGunNull() {
        Gun gun = null;
        Player player = new Player("a", 10);
        player.addGun(gun);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testGetGunShouldThrowExceptionIfTryToGetGunsAndThenAddGun() {
        Gun gun1 = new Gun("g1", 10);
        Gun gun2 = new Gun("g2", 10);
        Gun gun3 = new Gun("g3", 10);
        Player player = new Player("p", 10);
        player.addGun(gun1);
        player.addGun(gun2);
        player.addGun(gun3);
        player.getGuns().add(gun3);
    }

    @Test
    public void testTakeDamageShouldDecreaseHealthWithTheDamage() {
        Player testPlayer = new Player("a", 10);
        testPlayer.takeDamage(5);
        int expected = 5;
        int actual = testPlayer.getHealth();
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testTakeDamageShouldThrowExceptionIfHealthAlreadyZeroOrNegative() {
        Player testPlayer = new Player("a", 0);
        testPlayer.takeDamage(0);
    }

    @Test
    public void testTakeDamageShouldSetHealthToZeroIfDamageBiggerThanHealth() {
        Player testPlayer = new Player("a", 10);
        testPlayer.takeDamage(11);
        int actualHealth = testPlayer.getHealth();
        Assert.assertEquals(0, actualHealth);
    }

    @Test
    public void testAddGunShouldWorkCorrectlyIfGunIsNotNull() {
        Player testPlayer = new Player("a", 1);
        Gun gun1 = new Gun("g1", 10);
        testPlayer.addGun(gun1);
        Gun actualGun = testPlayer.getGun("g1");
        Assert.assertEquals(gun1, actualGun);
    }

    @Test(expected = NullPointerException.class)
    public void testAddGunShouldExceptionIfGunIsNull() {
        Player testPlayer = new Player("a", 1);
        Gun gun1 = null;
        testPlayer.addGun(gun1);
    }

    @Test
    public void testRemoveGunShouldReturnTrueIfGunExists() {
        Gun gun1 = new Gun("g1", 10);
        Gun gun2 = new Gun("g2", 10);
        Gun gun3 = new Gun("g3", 10);
        Player player = new Player("p", 10);
        player.addGun(gun1);
        player.addGun(gun2);
        player.addGun(gun3);
        boolean actual = player.removeGun(gun2);
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testGetGunShouldReturnTheGun() {
        Gun gun1 = new Gun("g1", 10);
        Gun gun2 = new Gun("g2", 10);
        Gun gun3 = new Gun("g3", 10);
        Player player = new Player("p", 10);
        player.addGun(gun1);
        player.addGun(gun2);
        player.addGun(gun3);
        Gun actualGun = player.getGun("g3");
        Assert.assertEquals(gun3, actualGun);
    }

    @Test
    public void testGetGunShouldReturnNullIfGunIsNotInCollection() {
        Gun gun1 = new Gun("g1", 10);
        Gun gun2 = new Gun("g2", 10);
        Gun gun3 = new Gun("g3", 10);
        Player player = new Player("p", 10);
        player.addGun(gun1);
        player.addGun(gun2);
        player.addGun(gun3);
        Gun actualGun = player.getGun("g4");
        Assert.assertNull(actualGun);
    }

//    private Map<String, Gun> generateGuns(int num) {
//        Map<String, Gun> collectionOfGuns = new LinkedHashMap<>();
//        for (int i = 0; i < num; i++) {
//            String name = "g" + i;
//            Gun gun = new Gun(name, 10);
//            collectionOfGuns.putIfAbsent(name, gun);
//        }
//        return collectionOfGuns;
//    }

}
