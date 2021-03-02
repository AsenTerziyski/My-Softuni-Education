package demo02Encapsulation;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal();
        String name = animal.name;
        Cat cat = new Cat();
        String name1 = cat.getName();
        System.out.println(name1);

    }
}
