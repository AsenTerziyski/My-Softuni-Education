package demo05;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("A", 20);
        Person person2 = new Person("A", 21);
        Person person3 = new Person("A", 75);
        Person person4 = new Person("D", 20);
        People people = new People();

        people.addPerson(person1);
        people.addPerson(person2);
        people.addPerson(person3);
        people.addPerson(person4);


        people.getPeople().stream().sorted((p1, p2) -> {
            int result = p2.getName().compareTo(p1.getName());
            if (result == 0) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
            return result;
        }).forEach(p -> System.out.println(p.getName() + "=>" + p.getAge()));

        //people.getPeople().clear();

        System.out.println(people.getPeople().size());
    }
}
