import java.util.ArrayList;
import java.util.Scanner;

public class OCU03OpinionPoll {
    public static class People {
        String name;
        int age;

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<People> peopleList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] inputDataPerson = scanner.nextLine().split(" ");
            String personName = inputDataPerson[0];
            int age = Integer.parseInt(inputDataPerson[1]);
            //obektyt person tryabva da e waw for tsikala za da se initsializira vseki put pri zavurtaneto.
            // Ako e predi for tsikala shte se dobavya v lista, no ponezhe sa referenten tip shte promenya vad
            // vseki elemnt ot lista!!!
            People person = new People();
            person.setName(personName);
            person.setAge(age);
            if (age > 30) {
                peopleList.add(person);
            }
        }
        sortByNamePrint(peopleList);
        //sortByAgePrint(peopleList);
    }

    private static void sortByAgePrint(ArrayList<People> peopleList) {
        peopleList.stream().
                sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge())).
                forEach(people ->
                        System.out.println(people.getName()+ " - " + people.getAge()));
    }
    private static void sortByNamePrint(ArrayList<People> peopleList) {
        // sortirane po ime (Mozhe i po age s integer - Lubo obyasnyava na 1:35-40;
        peopleList.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName())).
                forEach((people ->
                        System.out.println(people.getName()+ " - " + people.getAge())));
    }
}
