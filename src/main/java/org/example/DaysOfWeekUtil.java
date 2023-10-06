package org.example;

import java.util.Optional;

public class DaysOfWeekUtil {
    public static String getDayType(DaysOfWeek day) {
        String dayType = (day == DaysOfWeek.MONDAY || day == DaysOfWeek.TUESDAY ||
                day == DaysOfWeek.WEDNESDAY || day == DaysOfWeek.THURSDAY ||
                day == DaysOfWeek.FRIDAY) ? "Wochentag" :
                ((day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY) ? "Wochenendtag" : "Ungültiger Wochentag");
        return dayType;
    }

    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        DaysOfWeek saturday = DaysOfWeek.SATURDAY;

        System.out.println(monday + " ist ein " + getDayType(monday));
        System.out.println(saturday + " ist ein " + getDayType(saturday));
    }
}
