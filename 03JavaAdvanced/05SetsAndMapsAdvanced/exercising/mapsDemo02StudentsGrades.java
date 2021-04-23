import java.util.*;

public class mapsDemo02StudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentRecord = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String studentName = input[0];
            double studentGrade = Double.parseDouble(input[1]);
            studentRecord.putIfAbsent(studentName, new ArrayList<>());
            studentRecord.get(studentName).add(studentGrade);
        }


        if (studentRecord.isEmpty()) {
            throw new IllegalArgumentException("EmptyStudentsRecord");

        } else {
            for (Map.Entry<String, ArrayList<Double>> studentEntry : studentRecord.entrySet()) {

                ArrayList<Double> studentGrades = studentEntry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(studentEntry.getKey() + " -> ");
                double sum = 0.00;

                for (Double studentGrade : studentGrades) {
                    sum = sum + studentGrade;
                    sb.append(studentGrade + " ");
                }

                double avg = sum / studentGrades.size();
                sb.append(String.format("(avg: %.2f)", avg));
                System.out.println(sb.toString().trim());

            }
        }

    }
}
