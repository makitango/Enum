package org.example;

import static org.example.DaysOfWeekUtil.getDayType;

public class Main {
    public static void main(String[] args) {
        //favouriteDay
        Person person1 = new Person(1, "Jamie Lannister", DaysOfWeek.MONDAY);
        Person person2 = new Person(2, "Arthur Dayne", DaysOfWeek.FRIDAY);
        System.out.println("Person 1: " + person1.name() + " bevorzugt " + person1.favoriteDay());
        System.out.println("Person 2: " + person2.name() + " bevorzugt " + person2.favoriteDay());
    }
}