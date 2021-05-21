import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class OCU05Students {
    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
        //        @Override
//        public String toString() {
//            return String.format("%s %s: %.2f", firstName,lastName,grade);
//        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Student> studentList = new ArrayList<>();

        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String frstName = input[0];
            String lstName = input[1];
            double stGrade = Double.parseDouble(input[2]);
            Student currentStudent = new Student(frstName,lstName,stGrade);
            studentList.add(currentStudent);
        }
        sortGradePrintList(studentList);
    }

    private static void sortGradePrintList(ArrayList<Student> studentList) {
        // ako razmenya mestata na st2 i st1 shte gi printira v obraten red!:
        studentList.stream().sorted((st1, st2) -> Double.compare(st2.getGrade(), st1.getGrade())).
                forEach(st -> System.out.printf("%s %s: %.2f%n", st.getFirstName(), st.getLastName(), st.getGrade()));
    }
}
