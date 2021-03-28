package rpg_lab;

import org.junit.Test;

import static org.junit.Assert.*;

public class HeroTest {

    private static class TestWeapon implements Weapon {
        @Override
        public int getAttackPoints() {
            return 0;
        }
        @Override
        public int getDurabilityPoints() {
            return 0;
        }
        @Override
        public void attack(Target target) {
        }
    }

    private static class TestTarget implements Target{
        @Override
        public int getHealth() {
            return 0;
        }
        @Override
        public void takeAttack(int attackPoints) {

        }
        @Override
        public int giveExperience() {
            //return 0;
            return 13;
        }
        @Override
        public boolean isDead() {
//            return false;
            return true;
        }
    }

    @Test
    public  void testHeroGainsExperienceWhenTargetIsKilled () {
//        Weapon weapon = new Weapon() {
//            @Override
//            public int getAttackPoints() {
//                return 0;
//            }
//            @Override
//            public int getDurabilityPoints() {
//                return 0;
//            }
//            @Override
//            public void attack(Target target) {
//            }
//        };
        Hero hero = new Hero("Java_Wizard", new TestWeapon());
//        Target target = new Target() {
//            @Override
//            public int getHealth() { return 0; }
//            @Override
//            public void takeAttack(int attackPoints) {
//            }
//            @Override
//            public int giveExperience() {
//                //return 0;
//                return 13;
//            }
//            @Override
//            public boolean isDead() {
////                return false;
//                return true;
//            }
//        };
        hero.attack(new TestTarget());
        assertEquals(13, hero.getExperience());
    }

}