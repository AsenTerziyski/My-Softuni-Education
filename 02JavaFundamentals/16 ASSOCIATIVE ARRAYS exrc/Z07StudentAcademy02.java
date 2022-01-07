import java.util.*;

public class Z07StudentAcademy02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String nameStudent = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(nameStudent, new ArrayList<>());
            students.get(nameStudent).add(grade);
        }

        students
                .entrySet()
                .stream()
                .sorted((first, second) -> {
                    double firstAverage = first.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double secondAverage = second.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(secondAverage, firstAverage);
                })
                .forEach(student -> {
                    double averageGrade = student.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    if (averageGrade >= 4.50) {
                        System.out.println(String.format("%s -> %.2f", student.getKey(), averageGrade));
                    }
                });
    }
}
