import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OC05Students {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] studentData = inputLine.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];
            Student student = new Student(firstName, lastName, age, homeTown);
            students.add(student);
            inputLine = scanner.nextLine();
        }

        String filterCity = scanner.nextLine();

        for (Student student : students) {
            if (student.getHomeTown().equals(filterCity)) {
                System.out.printf("%s %s is %d years old\n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
    }

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        // konstruktor??
        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
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

        public String getHomeTown() {
            return homeTown;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }
    }
}
