package demo01;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Organism organism = new Organism(1000, "Old");
        Cat cat = new Cat(3, "Axl", "Gray");
        organism.gainEnergy();
        cat.gainEnergy();

        System.out.println("xxxxxxxxxxxxxxxx");
        cat.setColor("Orange");
        cat.gainEnergy();

    }
}
