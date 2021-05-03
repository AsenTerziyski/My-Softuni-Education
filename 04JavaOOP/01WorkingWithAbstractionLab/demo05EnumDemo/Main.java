package demo05EnumDemo;

import Calendar.WeekDay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int dayNumber = WeekDays.valueOf(input.toUpperCase()).getDayNumber();
        System.out.println(dayNumber);
        WeekDay[] values = WeekDay.values();
        for (WeekDay value : values) {
            System.out.println(value.getNumericPresentation());
            System.out.println(value);
        }
    }
}
