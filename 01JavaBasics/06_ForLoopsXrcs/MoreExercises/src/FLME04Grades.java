import java.util.Scanner;

public class FLME04Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numOfStudents = Integer.parseInt(scanner.nextLine());
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int countTotal = 0;
        double sumTotalGrade = 0.00;

        for (int i = 1; i <= numOfStudents; i++) {

            double grade = Double.parseDouble(scanner.nextLine());

            sumTotalGrade = sumTotalGrade + grade;

            if (grade >= 5.00) {
                count1 = count1 + 1;
            }

            if (grade >= 4.00 && grade <= 4.99) {
                count2 = count2 + 1;
            }

            if (grade >= 3.00 && grade <= 3.99) {
                count3 = count3 + 1;
            }

            if (grade < 3.00) {
                count4 = count4 + 1;
            }

        }

        countTotal = count1 + count2 + count3 + count4;
        double p1 = 100.00 * count1 / countTotal;
        double p2 = 100.00 * count2 / countTotal;
        double p3 = 100.00 * count3 / countTotal;
        double p4 = 100.00 * count4 / countTotal;
        double p5Average = sumTotalGrade / countTotal;

        System.out.printf("Top students: %.2f%%%n", p1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", p2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", p3);
        System.out.printf("Fail: %.2f%%%n", p4);
        System.out.printf("Average: %.2f", p5Average);
    }
}
