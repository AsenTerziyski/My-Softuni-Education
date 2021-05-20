import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OC06Students2point0 {

    static class Students {
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

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getHometown() {
            return hometown;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
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
            for (int i = 0; i < listStudents.size(); i++) {
                if (listStudents.get(i).getFirstName().equals(st.getFirstName()) &&
                        listStudents.get(i).getLastName().equals(st.getLastName())) {
                    st.setAge(age);
                    st.setHometown(homeTown);
                    listStudents.set(i, st);
                    break;
                }
            }
            input = scanner.nextLine();
        }
        removingListEquals(listStudents);
        String checkCity = scanner.nextLine();
        checkCityAndPrintList(listStudents, checkCity);
    }

    private static void checkCityAndPrintList(List<Students> listStudents, String checkCity) {
        for (int i = 0; i < listStudents.size(); i++) {
            if (checkCity.equals(listStudents.get(i).getHometown())) {
                System.out.printf("%s %s is %d years old%n", listStudents.get(i).getFirstName(), listStudents.get(i).getLastName(), listStudents.get(i).getAge());
            }
        }
    }

    private static void removingListEquals(List<Students> listStudents) {
        for (int i = 0; i < listStudents.size(); i++) {
            for (int j = i + 1; j < listStudents.size(); j++) {
                if (listStudents.get(i).equals(listStudents.get(j))) {
                    listStudents.remove(j);
                }
            }
        }
    }
}
