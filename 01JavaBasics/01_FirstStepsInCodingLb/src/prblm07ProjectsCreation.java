import java.util.Scanner;

public class prblm07ProjectsCreation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nameArch = scanner.nextLine();

        int projectsNumber = Integer.parseInt(scanner.nextLine());
        int hoursNeeded = projectsNumber * 3;

        if (projectsNumber > 0 && projectsNumber < 100)
            System.out.print("The architect " + nameArch + " will need " + hoursNeeded + " hours to complete " + projectsNumber + " project/s.");
    }

}
