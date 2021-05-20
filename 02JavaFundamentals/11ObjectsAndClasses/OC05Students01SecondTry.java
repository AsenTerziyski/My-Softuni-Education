import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OC05Students01SecondTry {
    public static class Students {
        //first name, last name, age and hometown
        String firstName;
        String lastName;
        int age;
        String hometown;

        public Students(String firstName, String lastName, int age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getHometown() {
            return hometown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Students> listStudents = new ArrayList<>();
        while (!input.equals("end")) {
            String[] inputArray = input.split("\\s+");
            String frstName = inputArray[0];
            String lstName = inputArray[1];
            int age = Integer.parseInt(inputArray[2]);
            String homeTown = inputArray[3];
            Students st = new Students(frstName, lstName, age, homeTown);
            listStudents.add(st);
            input = scanner.nextLine();
        }
        String checkCity = scanner.nextLine();
        for (int i = 0; i < listStudents.size(); i++) {
            if (checkCity.equals(listStudents.get(i).getHometown())) {
                System.out.printf("%s %s is %d years old%n", listStudents.get(i).getFirstName(), listStudents.get(i).getLastName(), listStudents.get(i).getAge());
            }
        }
    }
}
