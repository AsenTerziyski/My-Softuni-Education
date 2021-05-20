import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OC05StudentsThirdTry {
    static class Student {
        String name;
        String famillyName;
        int age;
        String town;

        public String getName() {
            return name;
        }

        public String getFamillyName() {
            return famillyName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setFamillyName(String famillyName) {
            this.famillyName = famillyName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> listOfStudents = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] inputStudent = input.split("\\s+");
            String firstNameStudent = inputStudent[0];
            String famillyNameStudent = inputStudent[1];
            int studentAge = Integer.parseInt(inputStudent[2]);
            String town = inputStudent[3];

            Student currentStudent = new Student();
            currentStudent.setName(firstNameStudent);
            currentStudent.setFamillyName(famillyNameStudent);
            currentStudent.setAge(studentAge);
            currentStudent.setTown(town);

            listOfStudents.add(currentStudent);

            input = scanner.nextLine();
        }

        String inputCity = scanner.nextLine();
        listOfStudents
                .stream()
                .forEach(st-> {
            if (st.getTown().equals(inputCity)) {
                System.out.println(String.format("%s %s is %d years old.", st.getName(), st.getFamillyName(), st.age));
            }
        });
    }
}
