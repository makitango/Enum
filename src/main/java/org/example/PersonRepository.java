package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    private List<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
