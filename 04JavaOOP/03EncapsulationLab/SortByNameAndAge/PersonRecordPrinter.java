package SortByNameAndAge;

public class PersonRecordPrinter {
    static void print (PersonRecord personRecord) {
        for (Person person : personRecord.getPersonArrayList()) {
            System.out.println(person.toString());
        }
    }
}
