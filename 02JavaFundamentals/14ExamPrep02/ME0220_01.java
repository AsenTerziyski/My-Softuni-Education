import java.util.Scanner;

public class ME0220_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        // int attendanceCurrentStudent = Integer.parseInt(scanner.nextLine());

        double maxBonus = Double.MIN_VALUE;
        int maxLectures = 0;
        for (int i = 1; i <= countOfStudents; i++) {
            int attendanceCurrentStudent = Integer.parseInt(scanner.nextLine());
            double currentTotBonus = 1.00 * attendanceCurrentStudent / countOfLectures * (5.00 + 1.0 * initialBonus);
            if (currentTotBonus > maxBonus) {
                maxBonus = currentTotBonus;
                maxLectures = attendanceCurrentStudent;
            }
        }

        //double maxBonusRounded = Math.ceil(maxBonus);
        System.out.printf("Max Bonus: %.0f.%n", maxBonus);
        System.out.printf("The student has attended %d lectures.", maxLectures);
    }

}

