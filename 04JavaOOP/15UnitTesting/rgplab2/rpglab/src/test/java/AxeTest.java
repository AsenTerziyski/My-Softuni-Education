import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

public class AxeTest {
    private final int ATTACK = 10;
    private final int DURABILITY = 13;

    @Test
    public void testAxeConstructorShouldSetCorrectAttackAndDurability() {
        // 3A Pattern
        // 1A -> Arrange
//        int attack = 10;
//        int durability = 13;
        // 2A -> Act
        //Axe axe = new Axe(attack, durability);
        Axe axe = createAxe(ATTACK, DURABILITY);
        // 3A -> Assert - клас Асърт:
        Assert.assertEquals(ATTACK, axe.getAttackPoints());
        Assert.assertEquals(DURABILITY, axe.getDurabilityPoints());
        // мога да слагам съобщения:
        //Assert.assertEquals("Expected and actual durabilty are not matching: ", durability, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAxeAttackShouldFailIfAxeHasZeroDurability() {
        //А1
//        int attack = 10;
//        int durability = 0;
        //А2
        Axe axe = createAxe(ATTACK, 0);
        Dummy dummy = new Dummy(100, 100);
        axe.attack(dummy);
        // А3 -> Assert -> в случая горе при нотейшън!
    }

    @Test
    public void testAxeLosesSingleDurabilityPointWhenAttackingDummy() {
//        int attack = 10;
//        int durability = 13;
        Axe axe = createAxe(ATTACK, DURABILITY);
//        Dummy dummy = createDummy();
//        axe.attack(dummy);
        axe.attack(createDummy());
        // очакваното дурабилити е с 1 по-малко =>
        Assert.assertEquals(DURABILITY-1, axe.getDurabilityPoints());
//        System.out.println(DURABILITY-1);
//        System.out.println(axe.getDurabilityPoints());

    }

    private Dummy createDummy() {
        return new Dummy(100, 100);
    }

    private Axe createAxe(int attack, int durability) {
        return new Axe(attack, durability);
    }
}
