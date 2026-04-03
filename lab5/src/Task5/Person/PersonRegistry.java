package Task5.Person;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person person) {
        if (person != null && !people.contains(person)) {
            people.add(person);
        }
    }

    public void removePerson(Person person) {
        people.remove(person);
    }

    public ArrayList<Person> findPeopleWithPets() {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.hasPet()) {
                result.add(person);
            }
        }
        return result;
    }

    public ArrayList<Person> findPeopleWithoutPets() {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : people) {
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