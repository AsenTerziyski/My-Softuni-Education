import java.util.Scanner;

public class x01xStudentInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        printAndFormat(name, age, grade);
    }

    private static void printAndFormat(String name, int age, double grade) {
        String fullStudentInfo = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, grade);
        System.out.println(fullStudentInfo);
    }
}
