package org.example;

public enum DaysOfWeek {
    MONDAY("Montag"),
    TUESDAY("Dienstag"),
    WEDNESDAY("Mittwoch"),
    THURSDAY("Donnerstag"),
    FRIDAY("Freitag"),
    SATURDAY("Samstag"),
    SUNDAY("Sonntag");

private String value;

    DaysOfWeek(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}