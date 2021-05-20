import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SplittableRandom;

public class OC06Students2point0SecondTry {
    static class Student20 {
        String name;
        String famillyName;
        String age;
        String city;

        public void setName(String name) {
            this.name = name;
        }

        public void setFamillyName(String famillyName) {
            this.famillyName = famillyName;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public String getFamillyName() {
            return famillyName;
        }

        public String getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Student20> studentsInfoList = new ArrayList();

        while (!input.equals("end")) {
            String[] inputArrayStudents = input.split("\\s+");
            String firstName = inputArrayStudents[0];
            String lastName = inputArrayStudents[1];
            String age = inputArrayStudents[2];
            String town = inputArrayStudents[3];

            Student20 currentStudent = new Student20();
            currentStudent.setName(firstName);
            currentStudent.setFamillyName(lastName);
            currentStudent.setAge(age);
            currentStudent.setCity(town);

            studentsInfoList.add(currentStudent);

            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        for (int i = studentsInfoList.size() - 1; i >= 0; i--) {
            if (studentsInfoList.get(i).getCity().equals(input)) {
                for (int j = i - 1; j >=0; j--) {
                    if (studentsInfoList.get(i).getName().equals(studentsInfoList.get(j).getName())
                            && studentsInfoList.get(i).getFamillyName().equals(studentsInfoList.get(j).getFamillyName())) {
                        studentsInfoList.remove(j);
                    }
                }

            }

        }

        studentsInfoList
                .stream().sorted((a, b) -> a.getName().compareTo(b.getName()))
                .forEach(s -> System.out.println(String.format("%s %s is %s years old.", s.getName(), s.getFamillyName(), s.getAge())));


    }
}
