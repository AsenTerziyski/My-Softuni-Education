import java.util.*;

public class Z06Courses03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, List<String>> courses = new HashMap<>();
        while (!"end".equals(input)) {
            String courseName = input.split(":")[0];
            String studentName = input.split(":")[1];

            courses.putIfAbsent(courseName, new LinkedList<>());
            courses.get(courseName).add(studentName);

            input = scanner.nextLine();
        }

        // целият код надолу е стрийм:

        courses.entrySet()
                .stream()
                .sorted((f,s)-> {
            Integer first = f.getValue().size();
            Integer second = s.getValue().size();
            return second.compareTo(first);
        })
        .forEach(e-> {
            System.out.println(String.format("%s: %d", e.getKey(), e.getValue().size()));

            e.getValue().stream().sorted((a,b)-> a.compareTo(b))
                    .forEach(s-> System.out.println(String.format("-- %s",s)));
        });

    }
}
