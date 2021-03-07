package hero;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // ако името на пакета не херо -> дава 85/100.
        Hero hero = new Hero("Hero", 1);
        System.out.println(hero.getLevel());
        System.out.println(hero.getUsername());

        Elf elf = new Elf("Elfie", 2);
        System.out.println(elf.getLevel());
        System.out.println(elf.getUsername());

        System.out.println(elf.toString());
        //ako искам да върне само Elf => давам то стринг метода гетсимпълнейм :
        // Type: Elf Username: Elfie Level: 2
        // иначе ще сложи името на пакета :
        // Type: Pr03PlayersAndMonsters.Elf Username: Elfie Level: 2

        System.out.println(hero.toString());

    }
}
