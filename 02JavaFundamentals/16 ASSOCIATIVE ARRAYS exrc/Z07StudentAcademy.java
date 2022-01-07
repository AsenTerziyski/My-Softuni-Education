import java.util.*;

public class Z07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> students = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double studentGrade = Double.parseDouble(scanner.nextLine());
            students.putIfAbsent(studentName, new ArrayList<>());
            students.get(studentName).add(studentGrade);
        }
        printMap(students);
    }

    private static void printMap(Map<String, List<Double>> students) {
        students
                .entrySet()
                .stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .sorted((s1, s2) -> {
                    Double first = s1.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    Double second = s2.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    //double result = first.compareTo(second);
                    //return second.compareTo(first);
                    return Double.compare(second, first);
                })
                .forEach(s -> System.out.println(String.format("%s -> %.2f",
                        s.getKey(),
                        s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble()
                )));
    }
}
