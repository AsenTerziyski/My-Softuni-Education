import java.util.Scanner;

public class WL08Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        int grade = 1;
        double sumMark = 0.00;
        double currentMark = 0.00;
        int countExcluded = 0;
        boolean isExcluded = false;

        while (grade <= 12) {
            currentMark = Double.parseDouble(scanner.nextLine());

            if (currentMark < 4) {
                countExcluded = countExcluded + 1;

                if (countExcluded == 2) {
                    isExcluded = true;
                    break;
                }

                continue;
            }

            grade = grade + 1;
            sumMark = sumMark + currentMark;
        }

        double averageMark = sumMark / 12;

        if (!isExcluded) {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageMark);
        } else {
            System.out.printf("%s has been excluded at %d grade", studentName, grade);
        }

    }
}