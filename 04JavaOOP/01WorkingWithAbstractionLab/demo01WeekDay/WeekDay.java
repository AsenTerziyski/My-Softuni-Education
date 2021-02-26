package Calendar;

public enum WeekDay {
    MONDAY(1, "Monday"),
    TUESDAY(2, "Tuesday"),
    WEDNESDAY(3, "Wednesday"),
    THURSDAY(4, "Thursday"),
    FRIDAY(5, "Friday"),
    SATURDAY(6, "Saturday"),
    SUNDAY(7, "Sunday");

    private int numericPresentation;
    private String name;

    WeekDay(int numericPresentation, String name) {
        this.numericPresentation = numericPresentation;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getNumericPresentation() {
        return numericPresentation;
    }
}
