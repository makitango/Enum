package org.example;

import java.util.Optional;

public class DaysOfWeekUtil {
    public static String getDayType(DaysOfWeek day) {
        return Optional.of(day)
                .filter(d -> d == DaysOfWeek.MONDAY || d == DaysOfWeek.TUESDAY ||
                        d == DaysOfWeek.WEDNESDAY || d == DaysOfWeek.THURSDAY ||
                        d == DaysOfWeek.FRIDAY)
                .map(DaysOfWeek::toString)
                .orElse(day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY ? "Wochenende" : "Ungültiger Wochentag");
    }

    public static void main(String[] args) {
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        DaysOfWeek saturday = DaysOfWeek.SATURDAY;

        System.out.println(monday + " ist ein " + getDayType(monday));
        System.out.println(saturday + " ist ein " + getDayType(saturday));
    }
}
