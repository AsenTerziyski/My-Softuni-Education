import java.util.Scanner;

public class x03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = Integer.parseInt(scanner.nextLine());
        String typePersons = scanner.nextLine();
        String daysOfWeek = scanner.nextLine();

        double pricePerPerson = 0.00;
        double totalSum = 0.00;

        switch (daysOfWeek) {
            case "Friday":
                switch (typePersons) {
                    case "Students":
                        pricePerPerson = 8.45;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 30) {
                            totalSum = totalSum * (1.00-0.15);
                        }
                        break;
                    case "Business":
                        pricePerPerson = 10.90;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 100) {
                            totalSum = totalSum - 10 * pricePerPerson;
                        }
                        break;
                    case "Regular":
                        pricePerPerson = 15.00;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 10 && persons <= 20) {
                            totalSum = totalSum * 0.95;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (typePersons) {
                    case "Students":
                        pricePerPerson = 9.80;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 30) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Business":
                        pricePerPerson = 15.60;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 100) {
                            totalSum = totalSum - 10 * pricePerPerson;
                        }
                        break;
                    case "Regular":
                        pricePerPerson = 20.00;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 10 && persons <= 20) {
                            totalSum = totalSum * 0.95;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (typePersons) {
                    case "Students":
                        pricePerPerson = 10.46;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 30) {
                            totalSum = totalSum * 0.85;
                        }
                        break;
                    case "Business":
                        pricePerPerson = 16.00;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 100) {
                            totalSum = totalSum - 10 * pricePerPerson;
                        }
                        break;
                    case "Regular":
                        pricePerPerson = 22.50;
                        totalSum = pricePerPerson * persons;
                        if (persons >= 10 && persons <= 20) {
                            totalSum = totalSum * 0.95;
                        }
                        break;
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalSum);
    }
}
