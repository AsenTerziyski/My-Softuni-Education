package demo01Enum;

public class Main {
    public static void main(String[] args) {
        WeekDay weekDay = WeekDay.valueOf("DAY1");
        System.out.println(weekDay);
        int ordinal = weekDay.ordinal();
        System.out.println(ordinal);
        WeekDay[] values = WeekDay.values();
        System.out.println("xxxxxxxxxxxxxxx");
        for (WeekDay value : values) {
            int ordinal1 = value.ordinal();
            //System.out.println(ordinal1);
            String name = value.name();
            System.out.print(name + ": ");
            System.out.println(name + " => " + ordinal1);
            System.out.println("xxxxxxxxxxxxxxx");
        }
    }
}
