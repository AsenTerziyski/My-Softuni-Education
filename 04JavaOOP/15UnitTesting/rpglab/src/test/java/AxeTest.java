import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {

    @Test
    public void testAxeConstructorShouldSetCorrectAttackAndDurability() {
        // 3A Pattern
        // 1A -> Arrange
        int attack = 10;
        int durability = 13;
        // 2A -> Act
        Axe axe = new Axe(attack, durability);
        // 3A -> Assert - клас Асърт:
        Assert.assertEquals(attack, axe.getAttackPoints());
        Assert.assertEquals(durability, axe.getDurabilityPoints());
        // мога да слагам съобщения:
        //Assert.assertEquals("Expected and actual durabilty are not matching: ", durability, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackShouldFailIfAxeHasZeroDurability() {
        //А1
        int attack = 10;
        int durability = 0;
        //А2
        Axe axe = new Axe(attack, durability);
        Dummy dummy = new Dummy(100, 100);
        axe.attack(dummy);
        // А3 -> Assert -> в случая горе при нотейшън!
    }
}
