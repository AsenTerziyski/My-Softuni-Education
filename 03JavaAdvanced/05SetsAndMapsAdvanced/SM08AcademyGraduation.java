    import java.util.Arrays;
    import java.util.Scanner;
    import java.util.SplittableRandom;
    import java.util.TreeMap;

    public class SM08AcademyGraduation {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());

            TreeMap<String, Double[]> studentInfo = new TreeMap<>();

            for (int i = 0; i < n; i++) {

                String currentStudentName = scanner.nextLine();
                double[] grades = Arrays
                        .stream(scanner.nextLine().split("\\s+"))
                        .mapToDouble(grade -> Double.parseDouble(grade))
                        .toArray();

                studentInfo.putIfAbsent(currentStudentName, new Double[grades.length]);
                for (int j = 0; j < grades.length; j++) {
                    studentInfo.get(currentStudentName)[j] = grades[j];
                }

            }

            studentInfo.entrySet().forEach(student -> {

                String currentStudent = student.getKey();
                int currentNumberGrades = student.getValue().length;

                double currentSum = 0;
                for (int i = 0; i < student.getValue().length; i++) {
                    currentSum = currentSum + student.getValue()[i];
                }

                double currentAverageGrade = currentSum / (currentNumberGrades * 1.00);
                //System.out.println(String.format("%s is graduated with %f", currentStudent, currentAverageGrade));
                System.out.println(currentStudent + " is graduated with " + currentAverageGrade);

            });

        }
    }
