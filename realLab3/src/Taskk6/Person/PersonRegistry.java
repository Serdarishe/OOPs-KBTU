package Taskk6.Person;

import Task5.Person.Person;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Task5.Person.Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Task5.Person.Person person) {
        if (person != null && !people.contains(person)) {
            people.add(person);
        }
    }

    public void removePerson(Task5.Person.Person person) {
        people.remove(person);
    }

    public ArrayList<Task5.Person.Person> findPeopleWithPets() {
        ArrayList<Task5.Person.Person> result = new ArrayList<>();
        for (Task5.Person.Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Task5.Person.Person> findPeopleWithoutPets() {
        ArrayList<Task5.Person.Person> result = new ArrayList<>();
        for (Task5.Person.Person person : people) {
            if (!person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person Registry:\n");
        for (Person person : people) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}