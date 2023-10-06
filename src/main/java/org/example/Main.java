package org.example;

import java.util.List;

import static org.example.DaysOfWeekUtil.getDayType;

public class Main {
    public static void main(String[] args) {
        //getDayType
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        DaysOfWeek saturday = DaysOfWeek.SATURDAY;
        System.out.println(" | getDayType | ");
        System.out.println(monday + " ist ein " + getDayType(monday));
        System.out.println(saturday + " ist ein " + getDayType(saturday));
        //favouriteDay
        Person person1 = new Person(1, "Jamie Lannister", DaysOfWeek.MONDAY);
        Person person2 = new Person(2, "Arthur Dayne", DaysOfWeek.FRIDAY);
        System.out.println(" | favouriteDay | ");
        System.out.println("Person 1: " + person1.name() + " bevorzugt " + person1.favoriteDay());
        System.out.println("Person 2: " + person2.name() + " bevorzugt " + person2.favoriteDay());
        //PersonRepository
        PersonRepository repository = new PersonRepository();
        repository.addPerson(person1);
        repository.addPerson(person2);
        List<Person> allPersons = repository.getAllPersons();
        System.out.println(" | PersonRepository | ");
        for (Person person : allPersons) {
            System.out.println("ID: " + person.id() + ", Name: " + person.name() + ", Favorite Day: " + person.favoriteDay());
        }
        //getPersonById
        System.out.println(" | getPersonById | ");
        System.out.println(repository.getPersonById(1));
    }
}
