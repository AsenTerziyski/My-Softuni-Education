import java.util.Scanner;

public class x03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int numOfCourses = elevCourses(people, capacity);
        System.out.println(numOfCourses);
    }

    private static int elevCourses(int people, int cap) {
        int courses = people / cap;
        int leftPassengers = people % cap;
        if (people <= cap) {
            courses = 1;
        } else if (leftPassengers != 0) {
            courses = courses + 1;
        }
        return courses;
    }
}
