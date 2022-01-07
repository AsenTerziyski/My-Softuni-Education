import java.util.*;

public class Z06Courses02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" : ");
            String courseName = tokens[0];
            String student = tokens[1];
            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new LinkedList<>());
                courses.get(courseName).add(student);
            } else {
                courses.get(courseName).add(student);
            }
            input = scanner.nextLine();
        }
        courses
                .entrySet()
                .stream()
                .sorted((first, second) -> second.getValue().size() - first.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                    e.getValue()
                            .stream()
                            .sorted((first, second) -> first.compareTo(second))
                            .forEach(student -> System.out.println("-- " + student));
                });
    }
}
