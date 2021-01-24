import java.sql.SQLOutput;
import java.util.*;

public class SM05AverageStudentsGrades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsGrades = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String currentStudent = input[0];
            double currentStudentGrade = Double.parseDouble(input[1]);
            studentsGrades.putIfAbsent(currentStudent, new LinkedList<>());
            studentsGrades.get(currentStudent).add(currentStudentGrade);
        }

        studentsGrades
                .entrySet()
                .stream()
                .sorted((firstSt, secondSt) -> {
                    return firstSt.getKey().compareTo(secondSt.getKey());
                }).forEach(entry -> {
            String studentToPrint = entry.getKey();
            System.out.print(String.format("%s -> ", studentToPrint));

            double sum = 0;
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.print(String.format("%.2f ", entry.getValue().get(i)));
                sum = sum + entry.getValue().get(i);
            }

            System.out.print(String.format("(avg: %.2f)", sum / entry.getValue().size()));
            System.out.println();
        });

    }
}
