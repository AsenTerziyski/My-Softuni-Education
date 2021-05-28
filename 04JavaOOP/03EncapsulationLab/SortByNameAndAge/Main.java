package SortByNameAndAge;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        PersonRecord personRecord = new PersonRecord();

        fillRecord(scanner, n, personRecord);
        PersonRecordPrinter.print(personRecord);
    }

    private static void fillRecord(Scanner scanner, int n, PersonRecord personRecord) {
        for (int i = 0; i <n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Person person = new Person(input[0], input[1], Integer.parseInt(input[2]));
            personRecord.addPerson(person);
        }
    }
}
