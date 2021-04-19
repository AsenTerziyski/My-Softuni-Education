package heroRepository;

import org.junit.Assert;
import org.junit.Test;

public class HeroRepositoryTests {
    //TODO: TEST ALL THE FUNCTIONALITY OF THE PROVIDED CLASS HeroRepository
//    @Test
//    public void testEmptyTest() {
//    }

    @Test
    public void testGetCount() {
        HeroRepository heroRepository = new HeroRepository();
        int expected = 0;
        Assert.assertEquals(expected, heroRepository.getCount());
        expected = 3;
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        Assert.assertEquals(3, heroRepository.getCount());
    }

    @Test (expected = NullPointerException.class)
    public void testCreateShouldThrowExceptionIfHeroNull() {
        Hero nullHero = null;
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(nullHero);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testCreateHeroShouldThrowExceptionIfHeroWithSameNameExists() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        Hero heroSameName = new Hero("A1", 2);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        heroRepository.create(heroSameName);
    }

    @Test
    public void testCreateHeroShouldReturnString() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        String expected = String.format("Successfully added hero %s with level %d",hero1.getName(), hero1.getLevel());
        HeroRepository heroRepository = new HeroRepository();
        String actual = heroRepository.create(hero1);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NullPointerException.class)
    public void testRemoveShouldThrowExceptionWhenHeroNameNullOrEmpty() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        String input = null;
        heroRepository.remove(input);
        input = "   ";
        heroRepository.remove(input);
    }

    @Test
    public void testRemoveShouldReturnTrueIfHeroExists() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        boolean actual = heroRepository.remove("A3");
        Assert.assertTrue(actual);
    }

    @Test
    public void testRemoveShouldReturnFalseIfHeroDoesNotExist() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 1);
        Hero hero3 = new Hero("A3", 1);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        boolean actual = heroRepository.remove("A4");
        Assert.assertFalse(actual);
    }

    @Test
    public void testGetHeroWithHighestLevel () {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 2);
        Hero hero3 = new Hero("A3", 3);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        Hero heroWithHighestLevel = heroRepository.getHeroWithHighestLevel();
        Assert.assertEquals(hero3, heroWithHighestLevel);
        HeroRepository emptyHero = new HeroRepository();
        Hero nullHero = emptyHero.getHeroWithHighestLevel();
        Assert.assertNull(nullHero);
    }

    @Test
    public void testGetHeroShouldReturnHeroWithThatName() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 2);
        Hero hero3 = new Hero("A3", 3);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        Hero actualHero = heroRepository.getHero("A3");
        Assert.assertEquals(hero3, actualHero);
    }

    @Test
    public void testGetHeroShouldReturnNullIfNoHeroWithThatName() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 2);
        Hero hero3 = new Hero("A3", 3);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        Hero actualHero = heroRepository.getHero("A4");
        Assert.assertNull(actualHero);
    }

    @Test (expected = UnsupportedOperationException.class)
    public void testGetHeroesShouldReturnUnmodifiableCollection() {
        Hero hero1 = new Hero("A1", 1);
        Hero hero2 = new Hero("A2", 2);
        Hero hero3 = new Hero("A3", 3);
        HeroRepository heroRepository = new HeroRepository();
        heroRepository.create(hero1);
        heroRepository.create(hero2);
        heroRepository.create(hero3);
        heroRepository.getHeroes().add(new Hero("A4",1));
        int expectedCount = 3;
        int actualCount = heroRepository.getCount();
        Assert.assertEquals(expectedCount, actualCount);
    }


}
