package Calendar;

public class Main {

    public static void main(String[] args) {
        // enum sa final, не могат да се променят:
        System.out.println(WeekDay.MONDAY.getNumericPresentation());
        System.out.println(WeekDay.TUESDAY.getNumericPresentation());
        System.out.println(WeekDay.WEDNESDAY.toString());
        System.out.println(String.format("%s -> No %d", WeekDay.FRIDAY.toString(), WeekDay.FRIDAY.getNumericPresentation()));
        System.out.println(WeekDay.FRIDAY.getName());
        System.out.println(String.format("%s => %d", WeekDay.MONDAY.getName(), WeekDay.MONDAY.getNumericPresentation()));

        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        WeekDay[] values = WeekDay.values();
        StringBuilder sb = new StringBuilder();
        for (WeekDay value : values) {
            sb.append(value.getName()).append(", ");
        }
        String output = sb.substring(0, sb.length()-2);
        System.out.println(output.trim());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");

    }
}

