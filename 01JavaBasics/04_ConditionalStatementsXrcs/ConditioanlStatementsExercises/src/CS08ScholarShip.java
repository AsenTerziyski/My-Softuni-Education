import java.util.Scanner;

public class CS08ScholarShip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double incomePerPerson = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double scholarshipSocial = 0.35 * minSalary;
        double scholarshipExellentGrade = averageGrade * 25;
        double scholarShipFinal = 0.00;

        if (averageGrade <= 4.5) {
            System.out.print("You cannot get a scholarship!");
        }

        if (averageGrade > 4.5 && averageGrade < 5.5 && incomePerPerson < minSalary) {
            scholarShipFinal = Math.floor(scholarshipSocial);
            System.out.printf("You get a Social scholarship %.0f BGN", scholarShipFinal);
        } else if (incomePerPerson > minSalary) {
            System.out.print("You cannot get a scholarship!");
        }

        if (averageGrade >= 5.5) {
            if (scholarshipSocial > scholarshipExellentGrade) {
                scholarShipFinal = Math.floor(scholarshipSocial);
                System.out.printf("You get a Social scholarship %.0f BGN", scholarShipFinal);
            } else {
                scholarShipFinal = Math.floor(scholarshipExellentGrade);
                System.out.printf("You get a scholarship for excellent results %.0f BGN", scholarShipFinal);
            }
        }

    }
}
