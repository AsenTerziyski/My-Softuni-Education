package rpg_lab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DummyTest {

    private static final int HEALTH = 10;
    private static final int EXPERIENCE = 13;
    private Dummy aliveDummy;
    private Dummy deadDummy;

    @Before
    public void setUp() {
        this.aliveDummy = new Dummy(HEALTH,EXPERIENCE);
        this.deadDummy = new Dummy(HEALTH-HEALTH, EXPERIENCE);
    }


    @Test
    public void testDummyLosesHealthWhenAttacked() {
        int attack = 3;
        this.aliveDummy.takeAttack(attack);
        assertEquals(HEALTH - attack, aliveDummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDeadDummyFailsWhenAttacked() {
        this.deadDummy.takeAttack(0);
    }

    @Test
    public void testDeadDummyGivesExperience() {
        //Dummy dummy = new Dummy(0, 13);
        int actualExperience = this.deadDummy.giveExperience();
        assertEquals(EXPERIENCE, actualExperience);
    }

    @Test(expected = IllegalStateException.class)
    public void testAliveDummyDoesNotGiveExperience() {
        aliveDummy.giveExperience();
    }

}