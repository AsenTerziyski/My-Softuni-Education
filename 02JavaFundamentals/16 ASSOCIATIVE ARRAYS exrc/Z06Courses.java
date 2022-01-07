import java.util.*;

public class Z06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String studentName = tokens[1];
            courses.putIfAbsent(courseName, new ArrayList<>());
//             мога да инициализирам междинна променлива лист. Може и направо:
//            List<String> students = courses.get(courseName);
//            students.add(studentName);
            courses.get(courseName).add(studentName);
            input = scanner.nextLine();
        }
        printMap(courses);
    }

    private static void printMap(Map<String, List<String>> courses) {
        courses
                .entrySet()
                .stream()
                .sorted((c1, c2) -> Integer.compare(c2.getValue().size(), c1.getValue().size()))
                .forEach(
                        entry -> {
                            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));
                            entry.getValue()
                                    .stream()
                                    .sorted((s1, s2) -> s1.compareTo(s2))
                                    .forEach(s -> System.out.println(String.format("-- %s", s)));
                        }
                );
    }
}
